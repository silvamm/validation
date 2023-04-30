package com.example.validation.config.exception.messages;


import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FieldErrorsMessage {

    private final int status = HttpStatus.BAD_REQUEST.value();
    private final LocalDateTime timestamp = LocalDateTime.now();
    private final String path;
    private final List<Map<String, String>> errors = new ArrayList<>();

    public FieldErrorsMessage(String path, String field, String message) {
        this.path = path;
        var fieldError = createFieldError(field, message);
        this.errors.add(fieldError);
    }

    public FieldErrorsMessage(String path, MethodArgumentNotValidException exception) {
        this.path = path;
        var fieldErrors = exception.getFieldErrors().stream()
                .map(fieldError -> createFieldError(fieldError.getField(), fieldError.getDefaultMessage()))
                .toList();
        this.errors.addAll(fieldErrors);
    }

    public FieldErrorsMessage(String path, ConstraintViolationException exception) {
        this.path = path;
        var fieldErrors = exception.getConstraintViolations().stream()
                .map(violation -> createFieldError(violation.getPropertyPath().toString(), violation.getMessage()))
                .toList();
        this.errors.addAll(fieldErrors);
    }

    private Map<String, String> createFieldError(String field, String errorMessage) {
        var error = new HashMap<String, String>();
        error.put("field", field);
        error.put("message", errorMessage);
        return error;
    }

    public int getStatus() {
        return status;
    }

    public List<Map<String, String>> getErrors() {
        return errors;
    }

    public String getPath() {
        return path;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }


}
