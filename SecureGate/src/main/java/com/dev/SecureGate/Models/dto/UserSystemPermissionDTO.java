package com.dev.SecureGate.Models.dto;

import com.dev.SecureGate.Models.entities.PermissionEntity;
import com.dev.SecureGate.Models.entities.RoleEntity;
import com.dev.SecureGate.Models.entities.SystemEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserSystemPermissionDTO {

    private UUID id;
    private SystemEntity system;
    private List<RoleEntityDTO> roles = new ArrayList<>();
    private List<PermissionEntityDTO> permissions = new ArrayList<>();
}
