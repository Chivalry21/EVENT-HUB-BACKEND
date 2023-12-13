package com.decagon.eventbookingsq16.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class AccountDetailsDto {
    private Long id;
    private String bankName;
    private String accountName;
    private Long accountNumber;
}