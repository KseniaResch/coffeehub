package com.example.coffehub.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigInteger;

@Entity
@Table(name = "role")
@Data

public class role {
    @Id
    private BigInteger id;

    @Column(nullable = false)
    private String name;
}
