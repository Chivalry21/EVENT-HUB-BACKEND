package com.decagon.eventbookingsq16.exception;

public class RequestedResourceNotFoundException extends RuntimeException{
    public RequestedResourceNotFoundException(String message){
        super(message);
    }
}
