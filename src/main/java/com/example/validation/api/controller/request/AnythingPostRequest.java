package com.example.validation.api.controller.request;

import com.example.validation.config.validation.ValidSecretNumber;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

import java.util.List;

public record AnythingPostRequest(
        @NotBlank String name,
        @NotNull
        @Valid
        ObjectInsidePostRequest object,
        @NotNull
        @Range(min = 1, max = 10, message = "{oneUntilTen}")
        Integer oneUntilTen,
        @ValidSecretNumber
        Integer number,
        @NotNull
        @NotEmpty
        @Valid
        List<ObjectInsidePostRequest> objects
) {
    public static AnythingPostRequest empty() {
        return new AnythingPostRequest(null, null, null, null, null);
    }
}
