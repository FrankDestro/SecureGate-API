package com.dev.SecureGate.controllers;

import com.dev.SecureGate.Models.dto.UserEntityDTO;
import com.dev.SecureGate.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/getAll")
    public ResponseEntity<Page<UserEntityDTO>> getUsers(Pageable pageable) {
         Page<UserEntityDTO> users = userService.getAllUsers(pageable);
        return ResponseEntity.ok().body(users);
    }
}

