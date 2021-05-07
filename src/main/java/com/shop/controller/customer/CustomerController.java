package com.shop.controller.customer;

import com.shop.dto.customer.CustomerDto;
import com.shop.mapper.customer.CustomerMapper;
import com.shop.service.customer.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("customers")
public class CustomerController {
    private final CustomerService service;
    private final CustomerMapper mapper;

    @PostMapping("/create")
    public void createCustomer(@RequestBody CustomerDto customerDto) {
        service.saveCustomer(mapper.mapToCustomer(customerDto));
    }
    @DeleteMapping("/delete/{customerId}")
    public void deleteCustomer(@PathVariable String customerId) {
        service.deleteCustomer(customerId);
    }
    @PutMapping("/update")
    public CustomerDto updateCustomer(@RequestBody CustomerDto customerDto) {
        return mapper.mapToCustomerDto(service.saveCustomer(mapper.mapToCustomer(customerDto)));
    }
}
