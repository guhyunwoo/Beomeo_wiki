package com.example.beomeo.domain.user.service;

import com.example.beomeo.domain.user.domain.User;
import com.example.beomeo.domain.user.domain.dto.SignupRequestDTO;
import com.example.beomeo.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder; // 비밀번호 암호화

    @Transactional
    public void signup(SignupRequestDTO request) {
        String encodedPassword = passwordEncoder.encode(request.getPassword()); // 비밀번호 암호화

        User user = User.builder()
                .email(request.getEmail())
                .username(request.getUsername())
                .password(encodedPassword) // 암호화된 비밀번호 저장
                .authority(request.getAuthority())
                .build();

        userRepository.save(user); // DB에 저장
    }
}
