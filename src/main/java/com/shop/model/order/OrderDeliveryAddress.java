package com.shop.model.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class OrderDeliveryAddress {
    private String city;
    private String postCode;
    private String street;
    private String address;
}
