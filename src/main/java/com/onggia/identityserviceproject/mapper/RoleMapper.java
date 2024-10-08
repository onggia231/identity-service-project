package com.onggia.identityserviceproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.onggia.identityserviceproject.dto.request.RoleRequest;
import com.onggia.identityserviceproject.dto.response.RoleResponse;
import com.onggia.identityserviceproject.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
