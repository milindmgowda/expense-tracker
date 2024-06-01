package com.milind.expense_tracker.controller;


import com.milind.expense_tracker.model.User;
import com.milind.expense_tracker.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ExpenseTrackerController {

    UserRepository userRepository = UserRepository.getInstance();

    @GetMapping("/users")
    ArrayList<User> getAllUsers() {
        return userRepository.getUsers();
    }

    @PostMapping("/user/{name}")
    User addUser(@PathVariable String name) {
        return userRepository.addUser(new User(name));
    }

    @GetMapping("/user/{id}")
    User getUser(@PathVariable Integer id) {
        return userRepository.getUser(id);
    }

}
