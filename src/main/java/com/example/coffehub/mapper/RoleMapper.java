package com.example.coffehub.mapper;

import com.example.coffehub.dto.RoleDto;
import com.example.coffehub.entity.RoleEntity;

public class RoleMapper {
    public RoleDto toDto(RoleEntity entity) {
        RoleDto dto = new RoleDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public RoleEntity toEntity(RoleDto dto) {
        RoleEntity entity = new RoleEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}

