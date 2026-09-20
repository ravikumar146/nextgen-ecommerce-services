package com.nextgen.ecommerce.reports.repository;

import com.nextgen.ecommerce.reports.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ReportRepository is a Spring Data JPA repository interface for managing Report entities.
 * It provides CRUD operations and query methods for the Report entity.
 */
@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
}
