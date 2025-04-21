package com.dev.SecureGate.services;

import com.dev.SecureGate.Models.dto.output.SystemOAuthClientDTO;
import com.dev.SecureGate.repositories.SystemRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class SystemService {

    private final SystemRepository systemRepository;

    @Transactional(readOnly = true)
    public Page<SystemOAuthClientDTO> getSystemsWithClients(Pageable pageable)throws JsonProcessingException  {
        Page<SystemOAuthClientDTO> list = systemRepository.findAllClientsWithSystems(pageable);
        return list;
    }
}
