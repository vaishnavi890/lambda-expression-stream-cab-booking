package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Driver;
import com.vaishnavi.cab.booking.service.DriverService;
import com.vaishnavi.cab.booking.utility.EntityProcessor;


public class DriverController {
    private final DriverService driverService = new DriverService();

    public void registerDriver(int driverId, String name, String email, String phone, String cabDetails) {
        Driver driver = new Driver(driverId, name, email, phone, cabDetails);
        EntityProcessor<Driver> processor = driverService::registerDriver;
        processor.process(driver);
    }
}
