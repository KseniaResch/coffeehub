package com.example.coffehub.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CheckDto {

    private BigInteger id;
    private BigDecimal total;
    private BigDecimal discount;
    private LocalDateTime dttm;
}
