package com.decagon.eventbookingsq16.repository;

import com.decagon.eventbookingsq16.model.Event;
import com.decagon.eventbookingsq16.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface TicketRepository extends JpaRepository<Ticket , Long> {

    Optional<Ticket> findById(Long ticketId);

    Ticket findByTicketId (Long ticketId);

    List<Ticket> findAllByEvent(Event event);
}
