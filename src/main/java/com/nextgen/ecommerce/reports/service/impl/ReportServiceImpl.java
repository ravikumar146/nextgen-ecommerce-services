package com.nextgen.ecommerce.reports.service.impl;

import com.nextgen.ecommerce.reports.entity.Report;
import com.nextgen.ecommerce.reports.repository.ReportRepository;
import com.nextgen.ecommerce.reports.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportRepository reportRepository;

    @Override
    public List<Report> getAllStatuses() {
        return List.of();
    }
}
