package com.example.coffehub.controller;

import com.example.coffehub.dto.CheckDto;
import com.example.coffehub.repository.CommonRepository;
import com.example.coffehub.repository.ProductRepository;
import com.example.coffehub.sevice.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j // creates Logger
@RestController
public class testcontroller {
    private final ProductService productService;

    public testcontroller(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public CheckDto check() {
        log.info("check");
        productService.test();
        return new CheckDto();
    }

}
