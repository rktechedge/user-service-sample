package com.example.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateUserRequest(

        @NotNull
        Long id,

        @NotBlank
        @Email
        String email,

        @NotNull
        Boolean active
) {}