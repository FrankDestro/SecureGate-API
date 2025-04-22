package com.dev.SecureGate.services;

import com.dev.SecureGate.Models.dto.UserEntityDTO;
import com.dev.SecureGate.Models.entities.UserEntity;
import com.dev.SecureGate.mappers.UserMapper;
import com.dev.SecureGate.repositories.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserService(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    public Page<UserEntityDTO> getAllUsers(Pageable pageable) {
        Page<UserEntity> users = userRepository.findAll(pageable);
        return users.map(userMapper::toDTO);
    }
}
