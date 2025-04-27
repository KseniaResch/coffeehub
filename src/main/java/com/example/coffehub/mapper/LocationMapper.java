package com.example.coffehub.mapper;

import com.example.coffehub.dto.LocationDto;
import com.example.coffehub.entity.LocationEntity;

public class LocationMapper {
    public LocationDto toDto(LocationEntity entity) {
        LocationDto dto = new LocationDto();
        dto.setId(entity.getId());
        dto.setAddress(entity.getAddress());
        dto.setOpeningTime(entity.getOpeningTime());
        dto.setClosingTime(entity.getClosingTime());
        dto.setType(entity.getType());
        return dto;
    }

    public LocationEntity toEntity(LocationDto dto) {

        LocationEntity entity = new LocationEntity();
        entity.setId(dto.getId());
        entity.setAddress(dto.getAddress());
        entity.setOpeningTime(dto.getOpeningTime());
        entity.setClosingTime(dto.getClosingTime());
        entity.setType(dto.getType());
        return entity;
    }
}
