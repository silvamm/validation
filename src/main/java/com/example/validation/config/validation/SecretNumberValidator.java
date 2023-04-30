package com.example.validation.config.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SecretNumberValidator implements ConstraintValidator<ValidSecretNumber, Integer> {

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        if(integer == null) return false;
        return integer.equals(7);
    }
}
