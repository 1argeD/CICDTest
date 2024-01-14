package com.cicdtest.cicdtest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {
    @GetMapping("/board/cicdTest")
    public ResponseEntity<?> test() {

        return ResponseEntity.ok().body(Map.of("msg","해당 데이터를 보냅니다."));
    }
}
