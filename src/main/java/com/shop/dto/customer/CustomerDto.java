package com.shop.dto.customer;

import com.shop.dto.cart.CartDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CustomerDto {
    private String id;
    private String firstName;
    private String lastName;
    private CommunicationCustomerDto communicationData;
    private AddressCustomerDto address;
    private CartDto cart;
}
