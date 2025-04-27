package com.example.coffehub.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class LocationDto {

    private BigInteger id;
    private BigDecimal total;
    private BigDecimal discount;
}
