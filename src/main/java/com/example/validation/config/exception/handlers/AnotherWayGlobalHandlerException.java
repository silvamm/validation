package com.example.validation.config.exception.handlers;

import com.example.validation.config.exception.custom.CustomException;
import com.example.validation.config.exception.messages.StandardErrorMessage;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AnotherWayGlobalHandlerException {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(CustomException.class)
    StandardErrorMessage handlerCustomException(CustomException exception, HttpServletRequest request){
        return new StandardErrorMessage(400, request.getServletPath(), exception.getMessage());
    }
}
