package com.example.coffehub.repository;

import com.example.coffehub.entity.CheckEntity;
import com.example.coffehub.entity.ProductEntity;
import jakarta.persistence.EntityManager;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public abstract class CheckRepository extends CommonRepository {


    public CheckRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public static void save(CheckEntity check) {
    }

    public abstract ResponseEntity addToCheck(BigInteger checkId, BigInteger productId);

    public abstract ResponseEntity removeProduct(BigInteger productId);

    public abstract ResponseEntity removeAll(BigInteger checkId, ProductEntity product);

    public CheckEntity findById(BigInteger checkId) {
    }

    public abstract ResponseEntity clearCheck(BigInteger checkId, ProductEntity product);
}
