package com.example.coffehub.config;

import com.example.coffehub.repository.ProductRepository;
import com.example.coffehub.sevice.ProductService;
import com.example.coffehub.sevice.impl.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @Bean
    public ProductService productService(ProductRepository productRepository) {
        return new ProductServiceImpl(productRepository);
    }
}
