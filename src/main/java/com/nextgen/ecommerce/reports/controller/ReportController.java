package com.nextgen.ecommerce.reports.controller;

import com.nextgen.ecommerce.reports.entity.Report;
import com.nextgen.ecommerce.reports.service.ReportService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ReportController is responsible for handling HTTP requests related to reports.
 * It serves as the entry point for report-related operations in the application.
 */
@Tag(name = "Reports", description = "Endpoints for managing reports")
@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @Operation(summary = "Status of the orders")
    @GetMapping("/orders/status")
    public ResponseEntity<List<Report>> getAllStatuses(){
        return ResponseEntity.ok(reportService.getAllStatuses());
    }
}
