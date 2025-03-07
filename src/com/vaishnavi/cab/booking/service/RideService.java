package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Ride;
import java.util.ArrayList;
import java.util.List;

public class RideService {
    private final List<Ride> rides = new ArrayList<>();

    public void registerRide(Ride ride) {
        rides.add(ride);
        System.out.println("Ride booked: " + ride);
    }

    public List<Ride> getCompletedRides() {
        return rides.stream().filter(r -> "COMPLETED".equalsIgnoreCase(r.status())).toList();
    }

    public void printRides() {
        int i = 0;
        do {
            if (rides.isEmpty()) {
                System.out.println("No rides available.");
                break;
            }
            System.out.println(rides.get(i));
            i++;
        } while (i < rides.size());
    }
}
