package com.example.beomeo.domain.user.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SignupRequestDTO {
    private String username;
    private String password;
    private String email;
}
