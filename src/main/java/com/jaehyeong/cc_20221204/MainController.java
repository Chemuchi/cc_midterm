package com.jaehyeong.cc_20221204;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String hello() {
        int a = 1;
        int b = 2;
        int c = a + b;
        return "Hello, Docker and Kubernetes! - V2";
    }
}
