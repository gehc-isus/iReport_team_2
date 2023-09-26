package com.example.demo.controller;


import com.example.demo.dao.ReportDao;
import com.example.demo.dto.ReportDto;
import com.example.demo.entity.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ReportController {

    // curl -X POST localhost:8080/report -d '{"reportData" : "this is a report","uploaderId" : 1, "patient" : "sick guy"}' -H 'Content-Type:application/json'
    // curl -X GET localhost:8080/report?patient=someone

    private final ReportDao reportDao;

    @Autowired
    public ReportController(ReportDao reportDao) {
        this.reportDao = reportDao;
    }

    @GetMapping("/report")
    public List<Report> getReport(@RequestParam(value = "patient") String patient) {
        return reportDao.findAll();
    }

    @PostMapping("/report")
    public  void insertReport(@RequestBody ReportDto reportDto) {
        reportDao.save(new Report(reportDto));
    }
}
