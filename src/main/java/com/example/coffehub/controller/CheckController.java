package com.example.coffehub.controller;

import com.example.coffehub.sevice.CheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
@Slf4j // creates Logger
@RestController
public class CheckController {
    @Autowired
    private CheckService checkService;
    public ResponseEntity addToCheck(Integer checkId, Integer locationId, Integer productId, Integer quantity) {
        log.info("trigger /addToCheck params: checkId = {}, locationId = {}, productId = {}, quantity = {}",
                 checkId, locationId, productId, quantity);
        return checkService.addToCheck(checkId, locationId, productId, quantity);



    }

}
