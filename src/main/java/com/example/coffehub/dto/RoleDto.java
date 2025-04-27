package com.example.coffehub.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigInteger;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class RoleDto {

    private BigInteger id;
    private String name;
}