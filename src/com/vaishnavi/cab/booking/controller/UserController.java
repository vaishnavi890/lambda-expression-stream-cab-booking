package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.User;
import com.vaishnavi.cab.booking.service.UserService;
import com.vaishnavi.cab.booking.utility.EntityProcessor;

public class UserController {
    private final UserService userService = new UserService();

    public void registerUser(int userId, String name, String email, String phone) {
        User user = new User(userId, name, email, phone);
        EntityProcessor<User> processor = userService::registerUser;
        processor.process(user);
    }
}
