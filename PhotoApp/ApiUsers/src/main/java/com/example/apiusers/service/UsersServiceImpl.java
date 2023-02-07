package com.example.apiusers.service;

import com.example.apiusers.shared.UserDTO;

import java.util.UUID;

public class UsersServiceImpl implements UsersService {
    @Override
    public UserDTO createUser(UserDTO userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());
        return null;
    }
}
