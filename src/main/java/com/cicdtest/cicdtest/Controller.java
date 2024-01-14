package com.cicdtest.cicdtest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/cicdTest")
    public String test() {
        return "index2";
    }
}
