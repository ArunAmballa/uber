package com.arun.project.uber.uberApp.dto;

import com.arun.project.uber.uberApp.entities.Rider;
import com.arun.project.uber.uberApp.enums.PaymentMethod;
import com.arun.project.uber.uberApp.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {

    private Long id;


    private Point pickUpLocation;


    private Point dropOffLocation;


    private LocalDateTime requestedTime;


    private RiderDto rider;


    private PaymentMethod paymentMethod;


    private RideRequestStatus rideRequestStatus;
}