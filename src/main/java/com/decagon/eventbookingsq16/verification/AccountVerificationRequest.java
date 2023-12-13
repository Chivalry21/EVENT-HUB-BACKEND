package com.decagon.eventbookingsq16.verification;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountVerificationRequest {
    private String accountNumber;
    private String bankCode;

}

