package com.decagon.eventbookingsq16.service;

import com.decagon.eventbookingsq16.dto.AuthenticationResponse;
import com.decagon.eventbookingsq16.dto.LoginDto;
import com.decagon.eventbookingsq16.dto.UserDto;
import com.decagon.eventbookingsq16.dto.UserResponseDto;
import org.springframework.http.ResponseEntity;

    public interface AuthService {
        ResponseEntity<UserResponseDto> signUp(UserDto userDto);
        void logout();
        AuthenticationResponse loginUser(LoginDto loginDto);

        ResponseEntity<String> verifyEmail(String token);

        void initiatePasswordReset(String username);
    }


