package com.decagon.eventbookingsq16.dto;

import lombok.Data;

@Data
public class TransferDto {
    private String email;
    private String source;
    private String password;
    private Double amount;
    private String recipient;
    private String reason;
    private String currency;
    private String reference;

}
