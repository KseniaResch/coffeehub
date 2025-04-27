package com.example.coffehub.mapper;

import com.example.coffehub.dto.DeliveryDto;
import com.example.coffehub.entity.DeliveryEntity;

public class DeliveryMapper {

    public DeliveryDto toDto(DeliveryEntity entity) {
        DeliveryDto dto = new DeliveryDto();
        dto.setId(entity.getId());
        dto.setDate(entity.getDate());
        dto.setStatus(entity.getStatus());
        return dto;
    }

    public DeliveryEntity toEntity(DeliveryDto dto) {
        DeliveryEntity entity = new DeliveryEntity();
        entity.setId(dto.getId());
        entity.setDate(dto.getDate());
        entity.setStatus(dto.getStatus());
        return entity;
    }
}
