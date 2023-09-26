package com.example.demo.dao;

import com.example.demo.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReportDao extends JpaRepository<Report, Integer> {

    public List<Report> findByPatient(String patient);

}
