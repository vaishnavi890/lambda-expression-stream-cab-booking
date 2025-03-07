package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Ride;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RideRepository {
    private final List<Ride> rides = new ArrayList<>();

    public void save(Ride ride) {
        rides.add(ride);
        System.out.println("Ride added successfully.");
    }

    public List<Ride> findAll() {
        return rides.stream().toList();
    }

    public Optional<Ride> findById(int rideId) {
        return rides.stream().filter(ride -> ride.rideId() == rideId).findFirst();
    }

    public List<Ride> getCompletedRides() {
        return rides.stream()
                .filter(ride -> "COMPLETED".equalsIgnoreCase(ride.status()))
                .toList();
    }
}
