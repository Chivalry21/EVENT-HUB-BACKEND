package com.decagon.eventbookingsq16.service;

import org.springframework.http.ResponseEntity;

public interface DatabaseSeedService {
    ResponseEntity<?> seedBanks();
}
