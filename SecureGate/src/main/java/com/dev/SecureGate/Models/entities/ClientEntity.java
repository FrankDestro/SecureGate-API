package com.dev.SecureGate.Models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "oauth_clients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true, nullable = false)
    private String clientId;

    private String clientSecret;
    private String scopes;

    @ManyToOne
    @JoinColumn(name = "system_id")
    private SystemEntity system;

    private boolean active = true;
}