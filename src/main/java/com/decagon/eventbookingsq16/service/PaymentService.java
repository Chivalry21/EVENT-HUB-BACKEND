package com.decagon.eventbookingsq16.service;

import com.decagon.eventbookingsq16.api.createRecipient.CreateRecipient;
import com.decagon.eventbookingsq16.api.paystackpaymentverify.PaystackImpl;
import com.decagon.eventbookingsq16.api.verifyaccount.VerifyAccount;
import com.decagon.eventbookingsq16.dto.CreateRecipientDto;
import com.decagon.eventbookingsq16.dto.TicketSaleDto;
import com.decagon.eventbookingsq16.exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import com.decagon.eventbookingsq16.dto.AccountDetailsDto;
import com.decagon.eventbookingsq16.dto.BankNameResponse;


public interface PaymentService {
    ResponseEntity<?> initializeTransaction(TicketSaleDto ticketDto) throws ResourceNotFoundException;

    ResponseEntity<PaystackImpl> verifyTransaction(String email) throws ResourceNotFoundException;

    ResponseEntity<VerifyAccount> verifyAccountDetails(CreateRecipientDto createRecipientDto) throws ResourceNotFoundException;

    BankNameResponse getAllBanks();

    String initiateTransfer() throws ResourceNotFoundException;


    ResponseEntity<CreateRecipient> createRecipient(CreateRecipientDto createRecipientDto) throws ResourceNotFoundException;





}
