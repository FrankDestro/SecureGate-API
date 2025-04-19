package com.dev.SecureGate.repositories;

import com.dev.SecureGate.Models.entities.SystemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SystemRepository extends JpaRepository<SystemEntity, UUID> {
    Optional<SystemEntity> findByCode(String code);
}
