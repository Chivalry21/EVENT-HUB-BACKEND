package com.decagon.eventbookingsq16.dto;


import lombok.Data;

    @Data
    public class PasswordRequestDto {
        private String username;
        private String oldPassword;
        private String newPassword;
        private String confirmPassword;
    }
