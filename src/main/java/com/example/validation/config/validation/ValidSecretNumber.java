package com.example.validation.config.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = SecretNumberValidator.class)
@Documented
public @interface ValidSecretNumber {

    String message() default "{secretNumber}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
