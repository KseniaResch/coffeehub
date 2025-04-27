package com.example.coffehub.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class RecipeDto {

    private BigInteger id;
    private String name;
    private String description;
    private LocalDate createdAt;
}
