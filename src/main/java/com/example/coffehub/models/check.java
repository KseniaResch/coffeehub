package com.example.coffehub.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table
@Data
public class check {
    @Id
    private BigInteger id;

    @Column(nullable = false)
    private BigDecimal total;

    private BigDecimal discount;
}
