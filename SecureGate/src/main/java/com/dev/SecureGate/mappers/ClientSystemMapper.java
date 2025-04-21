//package com.dev.SecureGate.mappers;
//
//
//import com.dev.SecureGate.Models.dto.output.SystemOAuthClientDTO;
//import com.dev.SecureGate.Models.entities.ClientEntity;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.Mappings;
//
//@Mapper(componentModel = "spring")
//public interface ClientSystemMapper {
//
//    @Mappings({
//            @Mapping(source = "id", target = "id"),
//            @Mapping(source = "code", target = "codigo"),
//            @Mapping(source = "name", target = "nome"),
//            @Mapping(source = "description", target = "descricao"),
//            @Mapping(source = "active", target = "ativo"),
//            @Mapping(source = "createdAt", target = "criado_em"),
//            @Mapping(source = "updatedAt", target = "atualizado_em"),
//
//            @Mapping(source = "clientId", target = "client_id"),
//            @Mapping(source = "clientSecret", target = "client_secret"),
//            @Mapping(source = "scopes", target = "scopes"),
//            @Mapping(source = "active", target = "oauth_client_ativo")
//    })
//    SystemOAuthClientDTO toDTO(ClientEntity client);
//}