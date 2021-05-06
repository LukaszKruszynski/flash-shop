package com.shop.model.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderCustomerDetails {
    private String customerId;
    private String firstName;
    private String lastName;
    private String mail;
    private String phone;
}
