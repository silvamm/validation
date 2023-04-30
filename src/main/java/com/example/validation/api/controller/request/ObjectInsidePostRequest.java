package com.example.validation.api.controller.request;

import jakarta.validation.constraints.NotBlank;

public record ObjectInsidePostRequest(
        @NotBlank
        String lastName
) {
}
