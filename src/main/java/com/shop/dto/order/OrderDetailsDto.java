package com.shop.dto.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailsDto {
    private boolean isPaid;
    private boolean isSend;
    private ShippingDetailsDto shippingDetails;
    private OrderCustomerDetailsDto orderCustomerDetailsDto;
}
