package com.example.coffehub.mapper;

import com.example.coffehub.dto.CheckDto;
import com.example.coffehub.entity.CheckEntity;



public class CheckMapper {
    public CheckDto toDto(CheckEntity check) {
        CheckDto dto = new CheckDto();
        dto.setId(check.getId());
        dto.setTotal(check.getTotal());
        dto.setDiscount(check.getDiscount());
        return dto;
    }

    public CheckEntity toEntity(CheckDto dto) {
        CheckEntity entity = new CheckEntity();
        entity.setId(dto.getId());
        entity.setTotal(dto.getTotal());
        entity.setDiscount(dto.getDiscount());
        return entity;
    }
}



