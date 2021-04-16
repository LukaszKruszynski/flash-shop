package com.shop.dto.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CommunicationCustomerDto {
    private String mail;
    private String phone;
}
