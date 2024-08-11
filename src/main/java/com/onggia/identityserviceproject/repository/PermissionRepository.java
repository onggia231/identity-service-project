package com.onggia.identityserviceproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onggia.identityserviceproject.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {}
