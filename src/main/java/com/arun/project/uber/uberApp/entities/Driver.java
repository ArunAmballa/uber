package com.arun.project.uber.uberApp.entities;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double rating;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Boolean available;

    @Column(columnDefinition = "Geometry(Point,4326)")
    Point currentLocation;


}
