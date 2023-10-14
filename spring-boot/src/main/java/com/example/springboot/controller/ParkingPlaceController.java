package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.ParkingPlace;
import com.example.springboot.service.Interface.ParkingPlaceService;

import java.util.Dictionary;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ParkingPlaceController {

	@Autowired
    private final ParkingPlaceService parkingPlaceService;
    public ParkingPlaceController(ParkingPlaceService parkingPlaceService){
        this.parkingPlaceService = parkingPlaceService;
    }

    @PostMapping(value = "/parkingplace")
    public ResponseEntity<String> createParkingPlace(@RequestBody ParkingPlace parkingPlace) {
        return ResponseEntity.ok(parkingPlaceService.createParkingPlace(parkingPlace));
    }

	@GetMapping("/parkingplace")
	public ResponseEntity<List<Dictionary<String, String>>> getAllParkingPlace() {
		return ResponseEntity.ok(parkingPlaceService.getAllParkingPlaces());
	}

}