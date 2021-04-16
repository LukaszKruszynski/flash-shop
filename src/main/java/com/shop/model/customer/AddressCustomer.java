package com.shop.model.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressCustomer {
    private String city;
    private String postCode;
    private String street;
    private String address;
}
