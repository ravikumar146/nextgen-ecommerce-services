package com.nextgen.ecommerce.customers.service.impl;

import com.nextgen.ecommerce.customers.entity.Customer;
import com.nextgen.ecommerce.customers.repository.CustomerRepository;
import com.nextgen.ecommerce.customers.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of the CustomerService interface.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
