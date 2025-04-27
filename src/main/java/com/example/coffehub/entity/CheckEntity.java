package com.example.coffehub.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Data
@NoArgsConstructor
public class CheckEntity {
    @Id
    private BigInteger id;

    @Column(nullable = false)
    private BigDecimal total;

    private BigDecimal discount;
}
