package com.amrit.usermanagement.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}