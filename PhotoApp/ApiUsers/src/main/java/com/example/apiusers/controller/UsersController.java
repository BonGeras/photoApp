package com.example.apiusers.controller;

import com.example.apiusers.model.CreateUserRequestModel;
import com.example.apiusers.model.CreateUserResponseModel;
import com.example.apiusers.service.UsersService;
import com.example.apiusers.shared.UserDTO;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Controller
public class UsersController {

    @Autowired
    private Environment environment;

    UsersService usersService;

    @GetMapping("/status/check")
    public String status() {
        return "User Service working on port " + environment.getProperty("local.server.port");
    }

    @PostMapping
    public ResponseEntity<CreateUserResponseModel> createUser(@Valid @RequestBody CreateUserRequestModel userDetails) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDTO userDTO = modelMapper.map(userDetails, UserDTO.class);
        UserDTO createdUser = usersService.createUser(userDTO);
        CreateUserResponseModel returnValue = modelMapper.map(createdUser, CreateUserResponseModel.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
    }
}
