package com.example.validation.api.controller.params;

import jakarta.validation.constraints.NotBlank;

public record AnythingGetParams(
        @NotBlank(message = "The code coverage ${formatter.format('{notblank}', validatedValue)} must be higher than {notblank}")
        String name
) {

}
