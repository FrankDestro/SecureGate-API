package com.dev.SecureGate.repositories;

import com.dev.SecureGate.Models.dto.output.SystemOAuthClientDTO;
import com.dev.SecureGate.Models.entities.SystemEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SystemRepository extends JpaRepository<SystemEntity, UUID> {

    Optional<SystemEntity> findByCode(String code);

    @Query(value = """
                    SELECT
                        s.id AS id,
                        s.code AS codigo,
                        s.name AS nome,
                        s.description AS descricao,
                        s.active AS ativo,
                        s.created_at AS criado_em,
                        s.updated_at AS atualizado_em,
            
                        o.client_id AS client_id,
                        o.client_secret AS client_secret,
                        o.scopes AS scopes,
                        o.active AS oauth_client_ativo
                    FROM public.systems s
                    INNER JOIN public.oauth_clients o ON s.id = o.system_id
            """,
            nativeQuery = true)
    Page<SystemOAuthClientDTO> findAllClientsWithSystems(Pageable pageable);



}
