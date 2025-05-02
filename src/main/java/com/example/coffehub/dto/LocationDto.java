package com.example.coffehub.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LocationDto {

    private BigInteger id;
    private BigDecimal total;
    private BigDecimal discount;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private String address;
    private String type;
}
