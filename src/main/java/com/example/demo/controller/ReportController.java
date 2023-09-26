package com.example.demo.controller;


import com.example.demo.dto.ReportDto;
import org.springframework.web.bind.annotation.*;


@RestController
public class ReportController {


    @GetMapping("/report")
    public String getReport(@RequestParam(value = "name") String name) {
        return "ASD";
    }

    @PostMapping("/report")
    public  void insertReport(@RequestBody ReportDto reportDto) {

    }
}
