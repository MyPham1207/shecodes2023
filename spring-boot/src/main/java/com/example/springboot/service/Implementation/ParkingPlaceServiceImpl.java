package com.example.springboot.service.Implementation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.model.ParkingPlace;
import com.example.springboot.repository.ParkingPlaceRepository;
import com.example.springboot.service.Interface.ParkingPlaceService;

import lombok.RequiredArgsConstructor;

import com.example.springboot.entity.ParkingPlaceEntity;

@Service
@Transactional()
@RequiredArgsConstructor
public class ParkingPlaceServiceImpl implements ParkingPlaceService{
    
    private final ParkingPlaceRepository parkingPlaceRepository;
    
    @Override
    public List<Dictionary<String, String>> getAllParkingPlaces() {
        List<ParkingPlaceEntity> parkingPlaceEntities = parkingPlaceRepository.findAll();
        List<Dictionary<String, String>> output = new ArrayList<Dictionary<String, String>>();
        for (ParkingPlaceEntity parkingPlaceEntity: parkingPlaceEntities) {
            Dictionary<String, String> place = new Hashtable<>();
            
            place.put("name", parkingPlaceEntity.getPlaceName());

            output.add(place);
        }
        return output;
    }

    @Override
    public String createParkingPlace (ParkingPlace parkingPlace) {
        ParkingPlaceEntity parkingPlaceEntity = new ParkingPlaceEntity();
        BeanUtils.copyProperties(parkingPlace, parkingPlaceEntity);
        parkingPlaceRepository.save(parkingPlaceEntity);
        return "Successfully add parking place!";
    }
}
