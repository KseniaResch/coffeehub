package com.example.coffehub.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDate;
@Entity
@Table(name = "recipe")
@Data
public class recipe {
       @Id
        private BigInteger id;

        @Column(nullable = false)
        private String name;

        private String description;

        @Column(name = "created_at")
        private LocalDate createdAt;
    }



