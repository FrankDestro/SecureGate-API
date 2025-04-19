package com.dev.SecureGate.Models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SystemEntityDTO {

    private UUID id;
    private String code;
    private String name;
    private String description;
    private boolean active = true;
}
