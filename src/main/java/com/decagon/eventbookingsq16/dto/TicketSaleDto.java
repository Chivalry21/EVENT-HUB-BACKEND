package com.decagon.eventbookingsq16.dto;

import com.decagon.eventbookingsq16.enums.PaymentType;
import com.decagon.eventbookingsq16.model.Ticket;
import lombok.Data;

import java.util.List;

@Data
public class TicketSaleDto {
    private String name;
    private String email;
    private PaymentType paymentType;
    private List<BookingDto> tickets;
}
