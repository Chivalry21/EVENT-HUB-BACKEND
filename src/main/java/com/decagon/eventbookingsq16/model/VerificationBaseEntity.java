package com.decagon.eventbookingsq16.model;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class VerificationBaseEntity extends BaseEntity{
    private String token;
    private Date expirationTime;
}
