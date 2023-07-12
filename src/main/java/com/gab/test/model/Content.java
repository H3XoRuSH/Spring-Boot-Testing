package com.gab.test.model;

import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

public record Content(
        Integer id,

        @NotEmpty
        String name,

        @NotEmpty
        String studentNumber,

        LocalDateTime dateCreated
) {
}
