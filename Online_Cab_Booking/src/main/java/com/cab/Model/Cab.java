package com.cab.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cabId;
    @NotNull
    private CabType cabtype;
    private double perKmRate;
    private Integer getCapacity;
    private Boolean cabAvailable = true;
    @NotNull
    private String registrationNumber;
    
}

