package com.arun.project.uber.uberApp.services;

import com.arun.project.uber.uberApp.dto.DriverDto;
import com.arun.project.uber.uberApp.dto.RideDto;
import com.arun.project.uber.uberApp.dto.RideRequestDto;
import com.arun.project.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();
}
