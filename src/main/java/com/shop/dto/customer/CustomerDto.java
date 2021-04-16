package com.shop.dto.customer;

import com.shop.model.cart.Cart;
import com.shop.model.customer.AddressCustomer;
import com.shop.model.customer.CommunicationCustomer;
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
    private CommunicationCustomer communicationData;
    private AddressCustomer address;
    private Cart cart;
}
