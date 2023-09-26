package com.example.demo.dto;

import jdk.jfr.Registered;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import java.util.Date;


public class ReportDto {

    private final Date date;

    private final String reportData;

    private  final Integer uploaderId;

    public ReportDto(Date date, String reportData, Integer uploaderId) {
        this.date = date;
        this.reportData = reportData;
        this.uploaderId = uploaderId;
    }

    public Date getDate() {
        return date;
    }

    public String getReportData() {
        return reportData;
    }

    public Integer getUploaderId() {
        return uploaderId;
    }
}
