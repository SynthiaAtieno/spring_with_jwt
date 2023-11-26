package com.example.jwtdemo.services.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public interface JwtServiceImpl {

    String extractUserName(String token);
    String generateToken(UserDetails userDetails);
}
