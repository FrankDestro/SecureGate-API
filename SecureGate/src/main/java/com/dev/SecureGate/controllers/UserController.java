package com.dev.SecureGate.controllers;

import com.dev.SecureGate.Models.dto.UserEntityDTO;
import com.dev.SecureGate.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/getAll")
    public List<UserEntityDTO> getUsers() {
        return userService.getAllUsers();
    }
}

