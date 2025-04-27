package com.example.coffehub.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ProductDto {

    private BigInteger id;
    private String name;
    private Integer quantity;
    private BigDecimal price;
    private String category;
}
