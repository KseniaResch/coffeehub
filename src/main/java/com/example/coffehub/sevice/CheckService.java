package com.example.coffehub.sevice;

import com.example.coffehub.dto.CheckDto;
import com.example.coffehub.dto.ResponseDto;
import com.example.coffehub.entity.CheckEntity;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;

public interface CheckService {
    ResponseDto addToCheck(Integer checkId, Integer locationId, Integer productId, Integer quantity);


    ResponseDto closeCheck(Integer checkId);

    ResponseDto openCheck();
}
