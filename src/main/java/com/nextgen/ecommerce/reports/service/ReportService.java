package com.nextgen.ecommerce.reports.service;

import com.nextgen.ecommerce.products.entity.Product;
import com.nextgen.ecommerce.reports.entity.Report;

import java.util.List;

public interface ReportService {

    List<Report> getAllStatuses();
}
