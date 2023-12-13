package com.decagon.eventbookingsq16.service;

import com.decagon.eventbookingsq16.model.Ticket;

import java.util.List;
import java.util.Map;

public interface TicketService {

    Map<String, Map<String, Integer>> findAllByEventId(Long eventId);
}
