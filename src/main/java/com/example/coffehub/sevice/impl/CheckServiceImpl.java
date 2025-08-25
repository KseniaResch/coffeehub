package com.example.coffehub.sevice.impl;

import com.example.coffehub.dto.CheckDto;
import com.example.coffehub.dto.ResponseDto;
import com.example.coffehub.entity.CheckEntity;
import com.example.coffehub.mapper.CheckMapper;
import com.example.coffehub.repository.CheckRepository;
import com.example.coffehub.sevice.CheckService;
import com.example.coffehub.sevice.ProductService;
import jakarta.persistence.EntityManager;
import org.hibernate.annotations.Check;
import org.springframework.beans.factory.annotation.Autowired;
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

    public CheckServiceImpl(CheckRepository checkRepository, CheckMapper checkMapper) {
        this.checkRepository = checkRepository;
        this.checkMapper = checkMapper;
    }

    @Override
    public ResponseDto addToCheck(Integer checkId, Integer locationId, Integer productId, Integer quantity) {

        checkRepository.addToCheck(checkId, locationId, productId, quantity);


        return new ResponseDto ("Product added to check.", 200, null);
    }

    @Override
    public ResponseDto closeCheck(Integer checkId) {

        try {
            checkRepository.closeCheck(checkId);
        } catch (Exception e) {
            return new ResponseDto(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), null);
        }
        return new ResponseDto("Check closed.", 200, null);
    }

    @Override
    public ResponseDto openCheck() {
        CheckEntity checkEntity =  checkRepository.openCheck(locationId);
        return new ResponseDto("ok", 200, checkMapper.toDto(checkEntity));

    }


}

