package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
        System.out.println("User added successfully.");
    }

    public List<User> findAll() {
        return users.stream().toList();
    }

    public Optional<User> findById(int userId) {
        return users.stream().filter(user -> user.userId() == userId).findFirst();
    }

    public List<String> getUserNames() {
        return users.stream().map(User::name).toList();
    }
}
