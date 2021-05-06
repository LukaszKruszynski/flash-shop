package com.shop.dto.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderCustomerDetailsDto {
    private String customerId;
    private String firstName;
    private String lastName;
    private String mail;
    private String phone;
}
