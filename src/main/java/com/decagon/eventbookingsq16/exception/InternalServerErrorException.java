package com.decagon.eventbookingsq16.exception;


import org.springframework.http.HttpStatus;

public class InternalServerErrorException extends Throwable {
    public InternalServerErrorException(String s, HttpStatus httpStatus) {
    }
}

