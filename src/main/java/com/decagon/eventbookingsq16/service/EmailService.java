package com.decagon.eventbookingsq16.service;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {
    void sendEmail(String toEmail, String subject, String content);

}
