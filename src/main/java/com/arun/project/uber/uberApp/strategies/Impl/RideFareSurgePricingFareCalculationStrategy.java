package com.arun.project.uber.uberApp.strategies.Impl;

import com.arun.project.uber.uberApp.dto.RideRequestDto;
import com.arun.project.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public Double calculateFare(RideRequestDto rideRequestDto) {
        return 0.0;
    }
}
