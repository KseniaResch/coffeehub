package com.example.coffehub.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class MeasureDto {

    private BigInteger id;
    private String name;

}
