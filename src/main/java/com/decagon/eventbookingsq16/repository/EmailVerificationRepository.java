package com.decagon.eventbookingsq16.repository;

import com.decagon.eventbookingsq16.model.EmailVerification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailVerificationRepository extends JpaRepository<EmailVerification,Long> {
    EmailVerification findByToken(String token);
}
