package com.shop.mapper.customer;

import com.shop.dto.customer.AddressCustomerDto;
import com.shop.dto.customer.CommunicationCustomerDto;
import com.shop.dto.customer.CustomerDto;
import com.shop.mapper.cart.CartMapper;
import com.shop.model.customer.AddressCustomer;
import com.shop.model.customer.CommunicationCustomer;
import com.shop.model.customer.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerMapper {
    private final CartMapper cartMapper;

    public CustomerDto mapToCustomerDto(Customer customer) {
        return CustomerDto.builder()
                .id(customer.getId())
                .address(this.mapToAddressCustomerDto(customer.getAddress()))
                .cart(cartMapper.mapToCartDto(customer.getCart()))
                .communicationData(this.mapToCommunicationCustomerDto(customer.getCommunicationData()))
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .build();
    }

    private CommunicationCustomerDto mapToCommunicationCustomerDto(CommunicationCustomer communicationData) {
        return CommunicationCustomerDto.builder()
                .mail(communicationData.getMail())
                .phone(communicationData.getPhone())
                .build();
    }

    private AddressCustomerDto mapToAddressCustomerDto(AddressCustomer addressCustomer) {
        return AddressCustomerDto.builder()
                .address(addressCustomer.getAddress())
                .city(addressCustomer.getCity())
                .postCode(addressCustomer.getPostCode())
                .street(addressCustomer.getStreet())
                .build();
    }

    public Customer mapToCustomer(CustomerDto customerDto) {
        return Customer.builder()
                .id(customerDto.getId())
                .address(this.mapToAddressCustomer(customerDto.getAddress()))
                .cart(cartMapper.mapToCart(customerDto.getCart()))
                .communicationData(this.mapToCommunicationCustomer(customerDto.getCommunicationData()))
                .firstName(customerDto.getFirstName())
                .lastName(customerDto.getLastName())
                .build();
    }
    private AddressCustomer mapToAddressCustomer(AddressCustomerDto addressCustomerDto) {
        return AddressCustomer.builder()
                .address(addressCustomerDto.getAddress())
                .city(addressCustomerDto.getCity())
                .postCode(addressCustomerDto.getPostCode())
                .street(addressCustomerDto.getStreet())
                .build();
    }
    private CommunicationCustomer mapToCommunicationCustomer(CommunicationCustomerDto communicationCustomerDto) {
        return CommunicationCustomer.builder()
                .mail(communicationCustomerDto.getMail())
                .phone(communicationCustomerDto.getPhone())
                .build();
    }
}
