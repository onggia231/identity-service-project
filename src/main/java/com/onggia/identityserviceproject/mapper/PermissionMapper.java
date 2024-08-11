package com.onggia.identityserviceproject.mapper;

import org.mapstruct.Mapper;

import com.onggia.identityserviceproject.dto.request.PermissionRequest;
import com.onggia.identityserviceproject.dto.response.PermissionResponse;
import com.onggia.identityserviceproject.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
