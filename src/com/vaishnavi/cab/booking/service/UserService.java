package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class UserService {
    private final List<User> users = new ArrayList<>();

    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user);
    }

    public List<String> getUserNames() {
        return users.stream().map(User::name).toList();
    }

    public void printUsers() {
        int i = 0;
        do {
            if (users.isEmpty()) {
                System.out.println("No registered users.");
                break;
            }
            System.out.println(users.get(i));
            i++;
        } while (i < users.size());
    }
}
