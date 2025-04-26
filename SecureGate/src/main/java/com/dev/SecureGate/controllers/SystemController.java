package com.dev.SecureGate.controllers;

import com.dev.SecureGate.Models.dto.output.SystemOAuthClientDTO;
import com.dev.SecureGate.services.SystemService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/system")
public class SystemController {

    private final SystemService systemService;

    @GetMapping("/getAllSystem")
    public ResponseEntity<Page<SystemOAuthClientDTO>> getAllSystem(
            Pageable pageable,
              @RequestParam(name = "nome", defaultValue = "") String nome
    ) throws JsonProcessingException {
        Page<SystemOAuthClientDTO> systems = systemService.getSystemsWithClients(pageable, nome);
        return ResponseEntity.ok().body(systems);
    }
}

