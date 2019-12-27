package com.devs.spring.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.devs.spring.security.model.User;
import com.devs.spring.security.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    //buscar email por medio del correo
    User findByEmail(String email);
     //guardar usuario registrado en el formulario
    User save(UserRegistrationDto registration);
    //actualizar contraseña olvidada
    void updatePassword(String password, Long userId);
}
