package com.example.beomeo.domain.user.domain;

import com.example.beomeo.domain.user.domain.type.Authority;
import com.example.beomeo.global.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity(name = "tbl_user")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    @Email
    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.authority = Authority.USER;
    }

    void changeAuthority() {
        this.authority = Authority.ADMIN;
    }
}
