package com.dev.SecureGate.mappers;

import com.dev.SecureGate.Models.dto.UserEntityDTO;
import com.dev.SecureGate.Models.entities.UserEntity;
import com.dev.SecureGate.Models.entities.UserSystemPermission;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "username", source = "user.username")
    @Mapping(target = "systems", expression = "java(mapUserSystems(user.getPermissions()))")
    UserEntityDTO toDTO(UserEntity user);

    default Map<String, UserEntityDTO.SystemDTO> mapUserSystems(List<UserSystemPermission> permissions) {
        return permissions.stream()
                .collect(Collectors.groupingBy(
                        permission -> permission.getSystem().getCode(),
                        Collectors.collectingAndThen(Collectors.toList(), list -> {
                            UserEntityDTO.SystemDTO systemDTO = new UserEntityDTO.SystemDTO();
                            systemDTO.setRoles(list.stream()
                                    .flatMap(permission -> permission.getRoles().stream())
                                    .map(role -> role.getName())
                                    .distinct()
                                    .collect(Collectors.toList()));
                            systemDTO.setPermissions(list.stream()
                                    .flatMap(permission -> permission.getPermissions().stream())
                                    .map(permission -> permission.getName())
                                    .distinct()
                                    .collect(Collectors.toList()));
                            return systemDTO;
                        })
                ));
    }
}

