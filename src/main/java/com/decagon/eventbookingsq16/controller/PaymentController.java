package com.decagon.eventbookingsq16.controller;

import com.decagon.eventbookingsq16.api.createRecipient.CreateRecipient;
import com.decagon.eventbookingsq16.api.paystackpaymentverify.PaystackImpl;
import com.decagon.eventbookingsq16.api.verifyaccount.VerifyAccount;
import com.decagon.eventbookingsq16.dto.AccountDetailsDto;
import com.decagon.eventbookingsq16.dto.BankNameResponse;
import com.decagon.eventbookingsq16.dto.CreateRecipientDto;
import com.decagon.eventbookingsq16.dto.TicketSaleDto;
import com.decagon.eventbookingsq16.exception.ResourceNotFoundException;
import com.decagon.eventbookingsq16.service.DatabaseSeedService;
import com.decagon.eventbookingsq16.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/transaction")
@Slf4j
public class PaymentController {
    private final PaymentService paymentService;
    private final DatabaseSeedService databaseSeedService;

    @PostMapping("/initializeTransaction")
    public ResponseEntity<?> initializeTransaction(@RequestBody TicketSaleDto ticketDto) throws ResourceNotFoundException {
        return paymentService.initializeTransaction(ticketDto);
    }

    @GetMapping("/verify_transaction")
    public RedirectView verifyTransaction(@RequestParam("trxref") String reference) throws ResourceNotFoundException {
        ResponseEntity<PaystackImpl> response = paymentService.verifyTransaction(reference);
        RedirectView redirectView = new RedirectView();
        if (response.getBody().getData().getStatus().equals("success")) {
            redirectView.setUrl("http://localhost:3000/#/skills");
        }
        return redirectView;
    }

    @GetMapping("/banks/verify")
    public ResponseEntity<VerifyAccount> verifyAccountDetails(@RequestBody CreateRecipientDto createRecipientDto) throws ResourceNotFoundException {
        return paymentService.verifyAccountDetails(createRecipientDto);
    }

   @GetMapping("/bank/list")
    public ResponseEntity<BankNameResponse> getAllBanks(){
      return new ResponseEntity<>(paymentService.getAllBanks(), HttpStatus.OK);
    }

    @PostMapping("/transfer")
    public String initiateTransfer() throws ResourceNotFoundException {
        return paymentService.initiateTransfer();
    }

    @PostMapping("/transfer/recipient")
    public ResponseEntity<CreateRecipient> createRecipient(@RequestBody CreateRecipientDto createRecipientDto) throws ResourceNotFoundException {
        return paymentService.createRecipient(createRecipientDto);
    }


}

