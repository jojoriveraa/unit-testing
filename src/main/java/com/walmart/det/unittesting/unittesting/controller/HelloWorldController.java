package com.walmart.det.unittesting.unittesting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello world";
    }

}