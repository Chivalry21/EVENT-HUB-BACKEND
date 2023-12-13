package com.decagon.eventbookingsq16.repository;

import com.decagon.eventbookingsq16.model.Bank;
import com.decagon.eventbookingsq16.model.UserTransactionInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserTransactionRepository extends JpaRepository<UserTransactionInfo, Long> {
    Optional<UserTransactionInfo> findByReference(String reference);
    Optional<UserTransactionInfo> findByEmail(String email);

}
