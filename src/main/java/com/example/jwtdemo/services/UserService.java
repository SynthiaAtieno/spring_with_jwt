package com.example.jwtdemo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service

public interface UserService {
    UserDetails loadUserByUserName(String username);
}
