package com.example.beomeo.domain.user.domain;

import com.example.beomeo.domain.user.domain.type.Authority;
import com.example.beomeo.global.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity(name = "tbl_user")
public class User extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Email
    @Size(max = 320)
    @Column(nullable = false, unique = true, length = 320)
    private String email;

    @Size(max = 20)
    @Column(nullable = false, unique = true, length = 20)
    private String username;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    public void update(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
