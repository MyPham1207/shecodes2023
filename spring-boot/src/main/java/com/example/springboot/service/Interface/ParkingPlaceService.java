package com.example.springboot.service.Interface;

import java.util.*;

import com.example.springboot.model.ParkingPlace;

public interface ParkingPlaceService {
    public List<Dictionary<String, String>> getAllParkingPlaces();
    public String createParkingPlace(ParkingPlace parkingPlace);
}
