package com.dev.SecureGate.Models.dto;


import com.dev.SecureGate.Models.entities.SystemEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PermissionEntityDTO {

    private UUID id;
    private String name;
    private SystemEntityDTO system;
}
