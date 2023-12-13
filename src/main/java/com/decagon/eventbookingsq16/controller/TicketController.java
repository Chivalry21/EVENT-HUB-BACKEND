package com.decagon.eventbookingsq16.controller;

import com.decagon.eventbookingsq16.model.Ticket;
import com.decagon.eventbookingsq16.repository.EventRepository;
import com.decagon.eventbookingsq16.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/ticket")
public class TicketController {

    private final TicketService ticketService;
    private final EventRepository eventRepository;

    @Autowired
    public TicketController(TicketService ticketService, EventRepository eventRepository) {
        this.ticketService = ticketService;
        this.eventRepository= eventRepository;
    }

    @GetMapping("/eventTicket/{eventId}")
    public ResponseEntity<Map<String, Map<String, Integer>>> FindAllByEventId(@PathVariable Long eventId) {
        Map<String, Map<String, Integer>> ticketInformation = ticketService.findAllByEventId(eventId);
        return ResponseEntity.ok(ticketInformation);
    }
}

