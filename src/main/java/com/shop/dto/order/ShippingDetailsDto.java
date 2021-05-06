package com.shop.dto.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShippingDetailsDto {
    private String deliverCompany;
    private String shipmentNumber;
    private String webLink;
    private OrderDeliveryAddressDto orderDeliveryAddress;
}
