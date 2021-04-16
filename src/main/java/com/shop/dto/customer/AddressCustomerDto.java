package com.shop.dto.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class AddressCustomerDto {
    private String city;
    private String postCode;
    private String street;
    private String address;
}
