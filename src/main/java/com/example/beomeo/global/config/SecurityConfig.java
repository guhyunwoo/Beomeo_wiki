package com.example.beomeo.global.config;

import org.springframework.boot.autoconfigure.security.oauth2.server.servlet.OAuth2AuthorizationServerJwtAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final JwtAuthenticationFilter authenticationFilter;

}
