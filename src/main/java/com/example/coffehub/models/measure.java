package com.example.coffehub.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigInteger;

@Entity
@Table(name = "measure")
@Data

public class measure {
    @Id
    private BigInteger id;

    private String name;
}
