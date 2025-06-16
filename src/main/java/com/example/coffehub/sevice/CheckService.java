package com.example.coffehub.sevice;

import org.springframework.http.ResponseEntity;

import java.math.BigInteger;

public interface CheckService {
    ResponseEntity addToCheck(BigInteger checkId, BigInteger productId);

    ResponseEntity addToCheck();
}
