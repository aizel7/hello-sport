package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSportController {
    @RequestMapping
    public String helloSport() {
        return "Hello Sport from Spring Boot";
    }
    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Goodbye From Spring Boot";
    }
}
