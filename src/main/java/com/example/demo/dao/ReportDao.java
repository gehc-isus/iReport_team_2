package com.example.demo.dao;

import com.example.demo.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportDao extends JpaRepository<Report, Integer> {
}
