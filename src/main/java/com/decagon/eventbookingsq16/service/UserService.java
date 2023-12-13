package com.decagon.eventbookingsq16.service;

import com.decagon.eventbookingsq16.dto.PasswordRequestDto;
import com.decagon.eventbookingsq16.exception.ResourceNotFoundException;
import com.decagon.eventbookingsq16.exception.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void updatePassword(PasswordRequestDto passwordRequestDto) throws UserNotFoundException;
    ResponseEntity<String> resetPassword(String token, String newPassword, String confirmPassword) throws ResourceNotFoundException;

}
