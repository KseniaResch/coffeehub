package com.example.coffehub.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDate;
@Entity
@Table
@Data
public class delivery { //TODO rename models to entity && class DeliveryEntity
    @Id
    private BigInteger id;

    @Column(name = "dt")
    private LocalDate date;

    @Column(nullable = false)
    private String status;
}
