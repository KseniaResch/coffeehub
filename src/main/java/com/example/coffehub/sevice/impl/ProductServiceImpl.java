package com.example.coffehub.sevice.impl;

import com.example.coffehub.repository.ProductRepository;
import com.example.coffehub.sevice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;


    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public void test(){
        productRepository.testConnection();

    }
}
