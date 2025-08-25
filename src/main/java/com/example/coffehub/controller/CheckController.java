package com.example.coffehub.controller;

import com.example.coffehub.dto.CheckDto;
import com.example.coffehub.dto.ResponseDto;
import com.example.coffehub.sevice.CheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // creates Logger
@RestController
@RequestMapping(path = "check")
public class CheckController {
    @Autowired
    private CheckService checkService;

    @PostMapping("add")
    public ResponseDto addToCheck(Integer checkId, Integer locationId, Integer productId, Integer quantity) {
        log.info("trigger /addToCheck params: checkId = {}, locationId = {}, productId = {}, quantity = {}", checkId, locationId, productId, quantity);
        return checkService.addToCheck(checkId, locationId, productId, quantity);
    }
    @PostMapping("close")
    public ResponseDto closeCheck(Integer checkId) {
        log.info("trigger /closeCheck params: checkId = {}", checkId);
        return checkService.closeCheck(checkId);
    }
    @PostMapping("open")
    public ResponseDto openCheck() {
        log.info("trigger /openCheck");
        return checkService.openCheck();

    }
}
