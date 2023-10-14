package com.example.springboot.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PARKING_PLACE")
public class ParkingPlaceEntity implements Serializable{
    //Default Constructor
    public ParkingPlaceEntity(){}


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLACE_ID", nullable = false, unique = true)
    private Long placeId;

    @Column(name = "PLACE_NAME")
    private String placeName;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "NUM_OF_SPACE_LEFT")
    private Integer numOfSpaceLeft;

    @Column(name = "PRICE")
    private Integer placePrice;
}