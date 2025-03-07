package com.vaishnavi.cab.booking;

import com.vaishnavi.cab.booking.model.*;
import com.vaishnavi.cab.booking.service.*;

import java.util.Scanner;

public class CabBooking {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    UserService userService = new UserService();
    DriverService driverService = new DriverService();
    RideService rideService = new RideService();
    PaymentService paymentService = new PaymentService();
    RatingService ratingService = new RatingService();

    int choice;
        do {
        System.out.println("\n=== Cab Order Management System ===");
        System.out.println("1. Register User");
        System.out.println("2. Register Driver");
        System.out.println("3. Book Ride");
        System.out.println("4. Make Payment");
        System.out.println("5. Submit Rating");
        System.out.println("6. Display Users");
        System.out.println("7. Display Drivers");
        System.out.println("8. Display Rides");
        System.out.println("9. Display Payments");
        System.out.println("10. Display Ratings");
        System.out.println("11. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1 -> {
                System.out.print("Enter User ID: ");
                int userId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                System.out.print("Enter Phone: ");
                String phone = scanner.nextLine();
                userService.registerUser(new User(userId, name, email, phone));
            }
            case 2 -> {
                System.out.print("Enter Driver ID: ");
                int driverId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                System.out.print("Enter Phone: ");
                String phone = scanner.nextLine();
                System.out.print("Enter Cab Details: ");
                String cabDetails = scanner.nextLine();
                driverService.registerDriver(new Driver(driverId, name, email, phone, cabDetails));
            }
            case 3 -> {
                System.out.print("Enter Ride ID: ");
                int rideId = scanner.nextInt();
                System.out.print("Enter User ID: ");
                int userId = scanner.nextInt();
                System.out.print("Enter Driver ID: ");
                int driverId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Pickup Location: ");
                String pickup = scanner.nextLine();
                System.out.print("Enter Dropoff Location: ");
                String dropoff = scanner.nextLine();
                System.out.print("Enter Fare: ");
                double fare = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter Status (Pending/Completed): ");
                String status = scanner.nextLine();
                rideService.registerRide(new Ride(rideId, userId, driverId, pickup, dropoff, fare, status));
            }
            case 4 -> {
                System.out.print("Enter Payment ID: ");
                int paymentId = scanner.nextInt();
                System.out.print("Enter Ride ID: ");
                int rideId = scanner.nextInt();
                System.out.print("Enter User ID: ");
                int userId = scanner.nextInt();
                System.out.print("Enter Amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter Payment Method: ");
                String method = scanner.nextLine();
                System.out.print("Enter Payment Status (Success/Failed): ");
                String status = scanner.nextLine();
                paymentService.processPayment(new Payment(paymentId, rideId, userId, amount, method, status));
            }
            case 5 -> {
                System.out.print("Enter Rating ID: ");
                int ratingId = scanner.nextInt();
                System.out.print("Enter Ride ID: ");
                int rideId = scanner.nextInt();
                System.out.print("Enter User ID: ");
                int userId = scanner.nextInt();
                System.out.print("Enter Driver ID: ");
                int driverId = scanner.nextInt();
                System.out.print("Enter Rating (1-5): ");
                int rating = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Review: ");
                String review = scanner.nextLine();
                ratingService.submitRating(new Rating(ratingId, rideId, userId, driverId, rating, review));
            }
            case 6 -> userService.printUsers();
            case 7 -> driverService.printDrivers();
            case 8 -> rideService.printRides();
            case 9 -> paymentService.printPayments();
            case 10 -> ratingService.printRatings();
            case 11 -> System.out.println("Exiting Cab Order Management System...");
            default -> System.out.println("Invalid choice! Please enter a valid option.");
        }
    } while (choice != 11);

        scanner.close();
}
}
