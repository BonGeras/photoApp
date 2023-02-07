<<<<<<< Updated upstream:PhotoApp/ApiUsers/src/main/java/com/example/apiusers/controller/UsersController.java
package com.example.apiusers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    @GetMapping("/status/check")
    public String status() {
        return "User Service working";
    }
}
=======
package com.example.apiusers.controller;

import com.example.apiusers.model.CreateUserRequestModel;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private Environment environment;

    @GetMapping("/status/check")
    public String status() {
        return "User Service working on port " + environment.getProperty("local.server.port");
    }

    @PostMapping
    public String createUser(@Valid @RequestBody CreateUserRequestModel userDetails) {
        return "create method is called";
    }
}
>>>>>>> Stashed changes:ApiUsers/src/main/java/com/example/apiusers/controller/UsersController.java
