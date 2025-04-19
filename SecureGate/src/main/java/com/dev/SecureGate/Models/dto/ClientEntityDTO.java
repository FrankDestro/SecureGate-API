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
public class ClientEntityDTO {

    private UUID id;
    private String clientId;
    private String clientSecret;
    private String scopes;
    private SystemEntity system;
    private boolean active = true;
}
