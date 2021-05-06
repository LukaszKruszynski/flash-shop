package com.shop.model.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetails {
    private boolean isPaid;
    private boolean isSend;
    private ShippingDetails shippingDetails;
    private OrderCustomerDetails orderCustomerDetails;
}
