package com.example.beomeo.domain.user.domain.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter()
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SignupRequestDTO {
    private String username;
    private String password;
}
