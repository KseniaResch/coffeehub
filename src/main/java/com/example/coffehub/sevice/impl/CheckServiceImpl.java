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

    return ResponseEntity.ok("Product added to check. New total: " + newTotal);
    }

    @Override
    public ResponseEntity removeProduct(BigInteger productId){
        if (productId == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Missing required fields");
        }
        CheckEntity check = new CheckEntity();
        ProductEntity product = new ProductEntity();
        BigDecimal currentTotal = check.getTotal();
        if (currentTotal == null) {
            currentTotal = BigDecimal.ZERO;
        }
        BigDecimal newTotal = currentTotal.subtract(product.getPrice());
        check.setTotal(newTotal);
        CheckRepository.save(check);
        return ResponseEntity.ok("Product removed from check. New total: " + newTotal);

    }


    @Override
    public ResponseEntity removeAll(BigInteger checkId, ProductEntity product){
        if (checkId == null || product == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Missing required fields");

        }
        CheckEntity check = new CheckEntity();
        List <ProductEntity> products = new ArrayList<ProductEntity>();
        products.removeAll(products);
        check.setTotal(BigDecimal.ZERO);
        CheckRepository.save(check);
        return ResponseEntity.ok("Products removed from check. New total: " + check.getTotal());


    }

    @Override
    public ResponseEntity clearCheck (BigInteger checkId, ProductEntity product){
        if (checkId == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Missing required fields");
        }
        CheckEntity check = checkRepository.findById(checkId);
        if (check == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Check not found");
        }
       return ResponseEntity.ok("Check removed from check. New total: " + check.getTotal());

    }


    }

