package com.example.coffehub.sevice.impl;

import com.example.coffehub.dto.CheckDto;
import com.example.coffehub.entity.CheckEntity;
import com.example.coffehub.mapper.CheckMapper;
import com.example.coffehub.repository.CheckRepository;
import com.example.coffehub.sevice.CheckService;
import com.example.coffehub.sevice.ProductService;
import jakarta.persistence.EntityManager;
import org.hibernate.annotations.Check;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CheckServiceImpl implements CheckService {


    private final CheckRepository checkRepository;
    private ProductService productService;
    @Value("${location-id}")
    private int locationId;
    private CheckMapper checkMapper;

    public CheckServiceImpl( CheckRepository checkRepository) {
        this.checkRepository = checkRepository;
    }

    @Override
    public ResponseEntity addToCheck(Integer checkId, Integer locationId, Integer productId, Integer quantity) {

        checkRepository.addToCheck(checkId, locationId, productId, quantity);


        return ResponseEntity.ok("Product added to check. New total: " );
    }

    @Override
    public ResponseEntity closeCheck(Integer checkId) {

        try {
            checkRepository.closeCheck(checkId);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
        return ResponseEntity.ok("Check closed.");
    }

    @Override
    public CheckDto openCheck() {
        CheckEntity checkEntity =  checkRepository.openCheck(locationId);
        return checkMapper.toDto(checkEntity);

    }


}

