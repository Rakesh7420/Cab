package com.cab.Model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;



@Data
@Entity
public class TripBooking {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tripBookingId;
    private String fromLocation;
    private String toLocation;
    private LocalDateTime fromDateTime;
    private LocalDateTime toDateTime;
    private float distanceInKm;
    private float bill;
    
    @OneToOne
    private Customer customer;
    
    @ManyToOne
    private Driver driver;
}
