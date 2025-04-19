package com.dev.SecureGate.repositories;


import com.dev.SecureGate.Models.entities.SystemEntity;
import com.dev.SecureGate.Models.entities.UserEntity;
import com.dev.SecureGate.Models.entities.UserSystemPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserSystemPermissionRepository extends JpaRepository<UserSystemPermission, UUID> {
    List<UserSystemPermission> findByUser(UserEntity user);
    Optional<UserSystemPermission> findByUserAndSystem(UserEntity user, SystemEntity system);
}
