package com.decagon.eventbookingsq16.dto;

import com.decagon.eventbookingsq16.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public class UserDto {

        private String firstName;

        private String lastName;

        private String username;

        private Date DOB;

        private String password;

        private String phoneNumber;
        private Role role;


    }


