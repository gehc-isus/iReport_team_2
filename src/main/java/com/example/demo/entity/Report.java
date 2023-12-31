package com.example.demo.entity;

import com.example.demo.dao.ReportDao;
import com.example.demo.dto.ReportDto;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "reportData")
    private String reportData;

    @Column(name = "uploaderId")
    private  Integer uploaderId;

    @Column(name = "patient")
    private  String patient;

    public Report(Long id, Date date, String reportData, Integer uploaderId) {
        this.id = id;
        this.date = date;
        this.reportData = reportData;
        this.uploaderId = uploaderId;
    }

    public Report(ReportDto reportDto){
        this.date = new Date();
        this.reportData = reportDto.getReportData();
        this.uploaderId = reportDto.getUploaderId();
        this.patient = reportDto.getPatient();
    }

    public Report() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getReportData() {
        return reportData;
    }

    public void setReportData(String reportData) {
        this.reportData = reportData;
    }

    public Integer getUploaderId() {
        return uploaderId;
    }

    public void setUploaderId(Integer uploaderId) {
        this.uploaderId = uploaderId;
    }

    public String getPatient() {
        return patient;
    }
}
