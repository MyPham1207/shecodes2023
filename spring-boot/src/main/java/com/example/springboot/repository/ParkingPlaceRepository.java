package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springboot.entity.ParkingPlaceEntity;


@Repository
public interface ParkingPlaceRepository extends JpaRepository<ParkingPlaceEntity, Long>{
      
}
