package com.dev.SecureGate.Models.dto.output;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SystemOAuthClientDTO {

    private UUID id;
    private String codigo;
    private String nome;
    private String descricao;
    private boolean ativo;
    private Timestamp criado_em;  // Altere para LocalDateTime
    private Timestamp atualizado_em;  // Altere para LocalDateTime

    private String client_id;
    private String client_secret;
    private String scopes;
    private boolean oauth_client_ativo;
}

