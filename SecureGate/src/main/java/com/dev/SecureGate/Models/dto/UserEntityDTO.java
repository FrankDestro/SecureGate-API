package com.dev.SecureGate.Models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntityDTO {
    private UUID id;
    private String name;
    private String username;
    private boolean active;
    private Map<String, SystemDTO> systems;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public static class SystemDTO {
        private List<String> roles;
        private List<String> permissions;
    }
}