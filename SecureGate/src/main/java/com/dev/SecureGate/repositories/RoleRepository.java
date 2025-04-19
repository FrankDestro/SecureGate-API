package com.dev.SecureGate.repositories;

import com.dev.SecureGate.Models.entities.RoleEntity;
import com.dev.SecureGate.Models.entities.SystemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, UUID> {
    List<RoleEntity> findBySystem(SystemEntity system);
}
