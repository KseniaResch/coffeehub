package com.example.coffehub.mapper;

import com.example.coffehub.dto.RecipeDto;
import com.example.coffehub.entity.RecipeEntity;

public class RecipeMapper {


        public RecipeDto toDto(RecipeEntity entity) {
            RecipeDto dto = new RecipeDto();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setDescription(entity.getDescription());
            dto.setCreatedAt(entity.getCreatedAt());
            return dto;
        }

        public RecipeEntity toEntity(RecipeDto dto) {
            RecipeEntity entity = new RecipeEntity();
            entity.setId(dto.getId());
            entity.setName(dto.getName());
            entity.setDescription(dto.getDescription());
            entity.setCreatedAt(dto.getCreatedAt());
            return entity;
        }
    }


