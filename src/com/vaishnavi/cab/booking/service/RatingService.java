package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Rating;
import java.util.ArrayList;
import java.util.List;

public class RatingService {
    private final List<Rating> ratings = new ArrayList<>();

    public void submitRating(Rating rating) {
        ratings.add(rating);
        System.out.println("Rating submitted: " + rating);
    }

    public List<Rating> getHighRatings() {
        return ratings.stream().filter(r -> r.rating() >= 4).toList();
    }

    public void printRatings() {
        int i = 0;
        do {
            if (ratings.isEmpty()) {
                System.out.println("No ratings available.");
                break;
            }
            System.out.println(ratings.get(i));
            i++;
        } while (i < ratings.size());
    }
}
