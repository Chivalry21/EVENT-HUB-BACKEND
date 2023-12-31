package com.decagon.eventbookingsq16.repository;

import com.decagon.eventbookingsq16.model.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Long> {
    Optional<AccountDetails> findByBankName(String bankName);

}
