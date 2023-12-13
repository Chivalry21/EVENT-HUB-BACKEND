package com.decagon.eventbookingsq16.dto;

import com.decagon.eventbookingsq16.model.Ticket;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SearchResultDto {
    private Long eventId;



    private String eventTitle;

    private String eventDescription;
    private String location;
    private String category;
    private String banner;
    private String organizer;
    private Integer availableTicket;
    private Date startDateTime;
    private Date endDateTime;

}
