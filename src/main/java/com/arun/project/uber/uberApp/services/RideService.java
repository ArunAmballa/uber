package com.arun.project.uber.uberApp.services;

import com.arun.project.uber.uberApp.dto.RideRequestDto;
import com.arun.project.uber.uberApp.entities.Driver;
import com.arun.project.uber.uberApp.entities.Ride;
import com.arun.project.uber.uberApp.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);



}