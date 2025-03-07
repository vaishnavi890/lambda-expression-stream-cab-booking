package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Rating;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class RatingRepository {
    private final List<Rating> ratings = new ArrayList<>();

    public void save(Rating rating) {
        ratings.add(rating);
        System.out.println("Rating added successfully.");
    }

    public List<Rating> findAll() {
        return ratings.stream().toList();
    }

    public Optional<Rating> findById(int ratingId) {
        return ratings.stream().filter(rating -> rating.ratingId() == ratingId).findFirst();
    }

    public List<Rating> getHighRatings() {
        return ratings.stream()
                .filter(rating -> rating.rating() >= 4)
                .toList();
    }
}
