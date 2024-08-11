package com.onggia.identityserviceproject.service;

import java.util.HashSet;
import java.util.List;

import org.springframework.stereotype.Service;

import com.onggia.identityserviceproject.dto.request.RoleRequest;
import com.onggia.identityserviceproject.dto.response.RoleResponse;
import com.onggia.identityserviceproject.mapper.RoleMapper;
import com.onggia.identityserviceproject.repository.PermissionRepository;
import com.onggia.identityserviceproject.repository.RoleRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class RoleService {

    RoleRepository roleRepository;
    PermissionRepository permissionRepository;
    RoleMapper roleMapper;

    public RoleResponse create(RoleRequest request) {
        var role = roleMapper.toRole(request);

        var permissions = permissionRepository.findAllById(request.getPermissions());
        role.setPermissions(new HashSet<>(permissions));

        role = roleRepository.save(role);
        return roleMapper.toRoleResponse(role);
    }

    public List<RoleResponse> getAll() {
        var roles = roleRepository.findAll();
        return roles.stream().map(roleMapper::toRoleResponse).toList();
    }

    public void delete(String role) {
        roleRepository.deleteById(role);
    }
}
