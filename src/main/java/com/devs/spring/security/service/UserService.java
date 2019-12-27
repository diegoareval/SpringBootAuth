package com.devs.spring.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.devs.spring.security.model.User;
import com.devs.spring.security.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);

    void updatePassword(String password, Long userId);
}
