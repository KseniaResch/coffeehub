package com.example.coffehub.mapper;

import com.example.coffehub.dto.WorkerDto;
import com.example.coffehub.entity.WorkerEntity;

public class WorkerMapper {
    public WorkerDto toDto(WorkerEntity entity) {
        WorkerDto dto = new WorkerDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public WorkerEntity toEntity(WorkerDto dto) {
        WorkerEntity entity = new WorkerEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
