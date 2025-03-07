package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Ride;
import com.vaishnavi.cab.booking.service.RideService;
import com.vaishnavi.cab.booking.utility.EntityProcessor;

public class RideController {
    private final RideService rideService = new RideService();

    public void registerRide(int rideId, int userId, int driverId, String pickup, String dropoff, double fare, String status) {
        Ride ride = new Ride(rideId, userId, driverId, pickup, dropoff, fare, status);
        EntityProcessor<Ride> processor = rideService::registerRide;
        processor.process(ride);
    }
}
