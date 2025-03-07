package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Rating;
import com.vaishnavi.cab.booking.service.RatingService;
import com.vaishnavi.cab.booking.utility.EntityProcessor;


public class RatingController {
    private final RatingService ratingService = new RatingService();

    public void submitRating(int ratingId, int rideId, int userId, int driverId, int rating, String review) {
        Rating ratingObj = new Rating(ratingId, rideId, userId, driverId, rating, review);
        EntityProcessor<Rating> processor = ratingService::submitRating;
        processor.process(ratingObj);
    }
}
