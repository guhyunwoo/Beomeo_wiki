package com.example.beomeo.domain.user.domain.type;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Password {
    @Column(table = "user_password")
    private String hash;
    @Column(columnDefinition = "Binary(16)", table = "user_password")
    private byte[] salt;
}
