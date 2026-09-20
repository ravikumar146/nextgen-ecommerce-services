package com.nextgen.ecommerce.customers.repository;

import com.nextgen.ecommerce.customers.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
/**
 * Repository interface for managing customer-related data operations.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {

    Customer findByCustomerNumber(String customerNumber);

    boolean existsByEmail(String email);

}
