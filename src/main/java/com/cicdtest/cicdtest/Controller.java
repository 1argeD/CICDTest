package com.cicdtest.cicdtest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("test")
    public String test() {
        return "해당 문구를 출력합니다.";
    }
}
