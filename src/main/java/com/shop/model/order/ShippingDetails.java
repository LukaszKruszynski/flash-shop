package com.shop.model.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShippingDetails {
    private String deliverCompany;
    private String shipmentNumber;
    private String webLink;
    private OrderDeliveryAddress orderDeliveryAddress;
}
