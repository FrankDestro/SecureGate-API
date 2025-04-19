package com.dev.SecureGate.Models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "user_system_permissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSystemPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private UserEntity user;

    @ManyToOne
    private SystemEntity system;

    @ManyToMany
    @JoinTable(
            name = "user_permission_roles",
            joinColumns = @JoinColumn(name = "user_permission_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<RoleEntity> roles = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "user_permission_perms",
            joinColumns = @JoinColumn(name = "user_permission_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    private List<PermissionEntity> permissions = new ArrayList<>();
}
