package com.shop.service.customer;

import com.shop.model.customer.Customer;
import com.shop.repository.customer.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    public void deleteCustomer(String customerId) {
        repository.deleteById(customerId);
    }
}
