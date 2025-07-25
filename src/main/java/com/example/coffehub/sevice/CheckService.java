package com.example.coffehub.sevice;

import org.springframework.http.ResponseEntity;

import java.math.BigInteger;

public interface CheckService {
    ResponseEntity addToCheck(Integer checkId, Integer locationId, Integer productId, Integer quantity);


}
