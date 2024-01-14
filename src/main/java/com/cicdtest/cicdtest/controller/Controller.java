package com.cicdtest.cicdtest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {
    @GetMapping("/cicd")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok().body(Map.of("msg","재배포 된거임???"));
    }
}
