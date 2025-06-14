package com.example.coffehub.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
@Slf4j // creates Logger
@RestController
public class CheckController {
    public ResponseEntity addToCheck(Integer id){
        log.info("trigger /addToCheck params: id =" + id);
        return ResponseEntity.ok().build();
    }

}
