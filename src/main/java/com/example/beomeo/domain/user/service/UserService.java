package com.example.beomeo.domain.user.service;

import com.example.beomeo.domain.user.domain.User;
import com.example.beomeo.domain.user.domain.dto.SignupRequestDTO;
import com.example.beomeo.domain.user.domain.repository.UserRepository;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final HttpServletResponse httpServletResponse;

    @Transactional
    public void signup(SignupRequestDTO request) {
        if (userRepository.existsByUsername(request.getUsername())) {
            throw new IllegalArgumentException("중복된 username 입니다.");
        } else if (userRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("중복된 email 입니다.");
        }

        User user = User.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .email(request.getEmail())
                .build();

        userRepository.save(user);
    }
}
