package com.arun.project.uber.uberApp.strategies.Impl;

import com.arun.project.uber.uberApp.dto.RideRequestDto;
import com.arun.project.uber.uberApp.entities.Driver;
import com.arun.project.uber.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class DriverMatchingHighestRatingDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
