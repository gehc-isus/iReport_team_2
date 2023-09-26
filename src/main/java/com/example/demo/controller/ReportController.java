package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ReportController {



    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public String greeting() {
        return "ASD";
    }
}
