package com.nextgen.ecommerce.customers.service;

import com.nextgen.ecommerce.customers.entity.Customer;

import java.util.List;

/**
 * Service interface for managing customer-related operations.
 */
public interface CustomerService {

    /**
     * Retrieves a customer by their ID.
     *
     * @param id the ID of the customer
     * @return the customer with the specified ID
     */
    Customer getCustomerById(Long id);

    /**
     * Retrieves all customers.
     *
     * @return a list of all customers
     */
    List<Customer> getAllCustomers();

    /**
     * Creates a new customer.
     *
     * @param customer the customer to be created
     * @return the created customer
     */
    Customer createCustomer(Customer customer);
}
