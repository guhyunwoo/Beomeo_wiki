package com.example.beomeo.domain.user.domain.repository;

import com.example.beomeo.domain.user.domain.User;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(@Size(max = 20) String username);
}
