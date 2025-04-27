package com.example.coffehub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigInteger;

@Entity
@Table(name = "measure")
@Data

public class MeasureEntity {
    @Id
    private BigInteger id;

    private String name;
}
