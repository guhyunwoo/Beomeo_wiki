package com.example.beomeo.domain.user.domain;

import com.example.beomeo.domain.user.domain.type.Authority;
import com.example.beomeo.global.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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
    private String nickname;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    public User(String email, String nickname, String password, Authority authority) {
        this.email = email;
        this.nickname = nickname;
        this.password = password;
        this.authority = authority;
    }

    public User update(String nickname) {
        this.nickname = nickname;
        return this;
    }
}
