package com.example.coffehub.sevice.impl;

import com.example.coffehub.entity.CheckEntity;
import com.example.coffehub.entity.ProductEntity;
import com.example.coffehub.repository.CheckRepository;
import com.example.coffehub.sevice.CheckService;
import com.example.coffehub.sevice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
public class checkServiceImpl implements CheckService {
    @Autowired
    private CheckService checkService;
    private ProductService productService;

@Override
public ResponseEntity addToCheck(BigInteger checkId, BigInteger productId) {
       if (productId == null || checkId == null) {
           throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Missing required fields");
       }

       CheckEntity check = new CheckEntity();
       ProductEntity product = new ProductEntity();

    BigDecimal currentTotal = check.getTotal();
    if (currentTotal == null) {
        currentTotal = BigDecimal.ZERO;
    }
    BigDecimal newTotal = currentTotal.add(product.getPrice());
    check.setTotal(newTotal);
    CheckRepository.save(check);

        //TODO check in DB
        //TODO if there are products- add to check
        // TODO return result ok / not ok
    return ResponseEntity.ok("Product added to check. New total: " + newTotal);
    }

    @Override
    public ResponseEntity addToCheck() {
        return null;
    }
}
