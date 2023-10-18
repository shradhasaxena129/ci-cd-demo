package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/ci-cd")
    public String hello_page() {
        return "ci-cd pipeline is ready";
    }
}
