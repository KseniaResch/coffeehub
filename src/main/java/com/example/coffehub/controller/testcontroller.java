package com.example.coffehub.controller;

import com.example.coffehub.dto.CheckDto;
import com.example.coffehub.repository.CommonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {
    static final Logger log = LoggerFactory.getLogger(testcontroller.class);
    @GetMapping
    public CheckDto check() {
        log.info("check");
        return new CheckDto();
    }
}
