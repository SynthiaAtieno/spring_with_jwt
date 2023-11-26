package com.example.jwtdemo.services.impl;

import com.example.jwtdemo.repository.UserRepository;
import com.example.jwtdemo.services.UserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserDetailService {
     private  final UserRepository userRepository;

     public UserDetailsService userDetailsService(){
         return new UserDetailsService() {
             @Override
             public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                 return userRepository.findByEmail(username)
                         .orElseThrow(() -> new UsernameNotFoundException("User not found"));
             }
         };
     }

}
