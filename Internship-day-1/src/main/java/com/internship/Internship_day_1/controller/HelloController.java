package com.internship.Internship_day_1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hello, Fullstack intern";
    }

    @GetMapping("/today")
    public String today()
    {
        return "Current Date & Time: "+ LocalDateTime.now();
    }




}
