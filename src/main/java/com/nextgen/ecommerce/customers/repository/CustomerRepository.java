package com.nextgen.ecommerce.customers.repository;

import com.nextgen.ecommerce.customers.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing customer-related data operations.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
