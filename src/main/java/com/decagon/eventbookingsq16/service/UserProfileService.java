package com.decagon.eventbookingsq16.service;

import com.decagon.eventbookingsq16.dto.UserProfileDto;
import org.springframework.stereotype.Service;

@Service
public interface UserProfileService {
    UserProfileDto createUserProfile(UserProfileDto userProfileDto);

    UserProfileDto editUserProfile(UserProfileDto userProfileDto);
}
