package com.example.coffehub.sevice.impl;

import com.example.coffehub.entity.CheckEntity;
import com.example.coffehub.entity.ProductEntity;
import com.example.coffehub.repository.CheckRepository;
import com.example.coffehub.sevice.ProductService;
import jakarta.persistence.EntityManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class CheckServiceImpl extends CheckRepository {

    private final CheckRepository checkRepository;
    private ProductService productService;

    public CheckServiceImpl(EntityManager entityManager, CheckRepository checkRepository) {
        super(entityManager);
        this.checkRepository = checkRepository;
    }

    @Override
    public ResponseEntity addToCheck(Integer checkId, Integer locationId, Integer productId, Integer quantity) {

        checkRepository.addToCheck(checkId, locationId, productId, quantity);


        return ResponseEntity.ok("Product added to check. New total: " );
    }



}

