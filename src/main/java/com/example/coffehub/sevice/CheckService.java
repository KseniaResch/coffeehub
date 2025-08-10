package com.example.coffehub.sevice;

import com.example.coffehub.dto.CheckDto;
import com.example.coffehub.entity.CheckEntity;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;

public interface CheckService {
    ResponseEntity addToCheck(Integer checkId, Integer locationId, Integer productId, Integer quantity);


    ResponseEntity closeCheck(Integer checkId);

    CheckDto openCheck();
}
