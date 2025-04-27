package com.example.coffehub.mapper;

import com.example.coffehub.dto.ProductDto;
import com.example.coffehub.entity.ProductEntity;

public class ProductMapper {
    public ProductDto toDto(ProductEntity entity) {
        ProductDto dto = new ProductDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setQuantity(entity.getQuantity());
        dto.setPrice(entity.getPrice());
        dto.setCategory(entity.getCategory());
        return dto;
    }

    public ProductEntity toEntity(ProductDto dto) {
        ProductEntity entity = new ProductEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setQuantity(dto.getQuantity());
        entity.setPrice(dto.getPrice());
        entity.setCategory(dto.getCategory());
        return entity;
    }
}
