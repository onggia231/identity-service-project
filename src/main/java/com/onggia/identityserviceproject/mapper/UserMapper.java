package com.onggia.identityserviceproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.onggia.identityserviceproject.dto.request.UserCreationRequest;
import com.onggia.identityserviceproject.dto.request.UserUpdateRequest;
import com.onggia.identityserviceproject.dto.response.UserResponse;
import com.onggia.identityserviceproject.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
