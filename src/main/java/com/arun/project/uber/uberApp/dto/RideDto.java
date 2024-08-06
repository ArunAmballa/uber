package com.arun.project.uber.uberApp.dto;

import com.arun.project.uber.uberApp.entities.Driver;
import com.arun.project.uber.uberApp.entities.Rider;
import com.arun.project.uber.uberApp.enums.PaymentMethod;
import com.arun.project.uber.uberApp.enums.RideStatus;
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

public class RideDto {

    private Long id;


    private Point pickUpLocation;

    private Point dropOffLocation;


    private LocalDateTime createdTime;

    private RiderDto rider;

    private DriverDto driver;


    private PaymentMethod paymentMethod;


    private RideStatus rideStatus;

    private Double fair;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;
}
