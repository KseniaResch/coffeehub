package com.example.coffehub.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class DeliveryDto {

    private BigInteger id;
    private LocalDate date;
    private String status;
}
