package com.decagon.eventbookingsq16.repository;

import com.decagon.eventbookingsq16.model.User;
import com.decagon.eventbookingsq16.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

    Optional<Object> findByUser(User user);
}
