package com.example.coffehub.mapper;

import com.example.coffehub.dto.MeasureDto;
import com.example.coffehub.entity.MeasureEntity;

public class MeasureMapper {
    public MeasureDto toDto(MeasureEntity entity) {
        MeasureDto dto = new MeasureDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public MeasureEntity toEntity(MeasureDto dto) {
        MeasureEntity entity = new MeasureEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
