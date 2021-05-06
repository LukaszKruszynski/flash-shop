package com.shop.dto.customer;

import com.shop.model.cart.Cart;
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
    private Cart cart;
}
