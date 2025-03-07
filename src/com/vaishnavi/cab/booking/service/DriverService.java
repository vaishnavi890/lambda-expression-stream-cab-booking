package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Driver;
import java.util.ArrayList;
import java.util.List;

public class DriverService {
    private final List<Driver> drivers = new ArrayList<>();

    public void registerDriver(Driver driver) {
        drivers.add(driver);
        System.out.println("Driver registered: " + driver);
    }

    public List<String> getDriverNames() {
        return drivers.stream().map(Driver::name).toList();
    }

    public void printDrivers() {
        int i = 0;
        do {
            if (drivers.isEmpty()) {
                System.out.println("No registered drivers.");
                break;
            }
            System.out.println(drivers.get(i));
            i++;
        } while (i < drivers.size());
    }
}
