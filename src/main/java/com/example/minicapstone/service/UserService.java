package com.example.minicapstone.service;

import com.example.minicapstone.dto.UserDTO;
import com.example.minicapstone.model.UserRequest;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    public UserDTO saveUser(@NonNull UserRequest newUser) {
        return null;
    }
}
