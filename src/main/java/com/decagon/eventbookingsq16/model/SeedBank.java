package com.decagon.eventbookingsq16.model;

import com.decagon.eventbookingsq16.serviceImpl.DatabaseSeedServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

@EnableAsync
@EnableScheduling
@SpringBootApplication()
public class SeedBank implements CommandLineRunner {

    private final DatabaseSeedServiceImpl databaseSeedService;

    public SeedBank(DatabaseSeedServiceImpl databaseSeedService) {
        this.databaseSeedService = databaseSeedService;
    }

    @Override
    public void run(String[] args) throws Exception {
       databaseSeedService.seedBanks();
    }
}
