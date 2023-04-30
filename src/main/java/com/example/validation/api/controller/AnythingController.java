package com.example.validation.api.controller;

import com.example.validation.api.controller.params.AnythingGetParams;
import com.example.validation.api.controller.request.AnythingPostRequest;
import com.example.validation.config.exception.custom.CustomException;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import jakarta.validation.Validator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AnythingController {

    private Validator validator;

    public AnythingController(Validator validator) {
        this.validator = validator;
    }

    @GetMapping("{name}")
    public String getAnything(@Valid AnythingGetParams params) {
        return "received";
    }

    @PostMapping
    public String postAnything(@Valid @RequestBody AnythingPostRequest request) {
        return "saved";
    }

    @GetMapping("/exception")
    public void throwCustomException() {
        throw new CustomException("error");
    }

    @GetMapping("/programmatically")
    public void throwConstraintsProgrammatically() {
        var request =  AnythingPostRequest.empty();
        var violations = validator.validate(request);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }

}
