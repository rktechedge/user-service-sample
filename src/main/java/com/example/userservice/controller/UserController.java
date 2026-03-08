package com.example.userservice.controller;

import com.example.userservice.dto.UserDTO;
import com.example.userservice.user.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.userservice.dto.CreateUserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;


@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public UserDTO getUser(@PathVariable Long id) {
        return userService.getActiveUser(id);
    }

    @PostMapping("/users")
    public UserDTO createUser(@Valid @RequestBody CreateUserRequest request) {

        var user = new com.example.userservice.user.User(
                request.id(),
                request.email(),
                request.active()
        );

        return userService.createUser(user);
    }

}
