package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DriverRepository {
    private final List<Driver> drivers = new ArrayList<>();

    public void save(Driver driver) {
        drivers.add(driver);
        System.out.println("Driver added successfully.");
    }

    public List<Driver> findAll() {
        return drivers.stream().toList();
    }

    public Optional<Driver> findById(int driverId) {
        return drivers.stream().filter(driver -> driver.driverId() == driverId).findFirst();
    }

    public List<String> getDriverNames() {
        return drivers.stream().map(Driver::name).toList();
    }
}
