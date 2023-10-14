package com.example.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingPlace {
    private Long placeId;
    private String placeName;
    private String address;
    private Integer numOfSpaceLeft;
    private Integer placePrice;
}
