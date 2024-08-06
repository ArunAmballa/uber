package com.arun.project.uber.uberApp.services;

import com.arun.project.uber.uberApp.dto.DriverDto;
import com.arun.project.uber.uberApp.dto.RideDto;
import com.arun.project.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId,Integer rating);

    RideDto acceptRide(Long rideId );

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();
}
