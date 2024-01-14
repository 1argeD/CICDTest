package com.cicdtest.cicdtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("board/cicdTest")
    public String test() {
        return "index1";
    }
}
