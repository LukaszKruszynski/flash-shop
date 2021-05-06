package com.shop.dto.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDeliveryAddressDto {
    private String city;
    private String postCode;
    private String street;
    private String address;
}
