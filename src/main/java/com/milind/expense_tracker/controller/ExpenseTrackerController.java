package com.milind.expense_tracker.controller;


import com.milind.expense_tracker.model.Expense;
import com.milind.expense_tracker.model.User;
import com.milind.expense_tracker.repository.UserRepository;
import netscape.javascript.JSObject;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

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

    @PostMapping("/user/{userId}/expense")
    Expense addUserExpense(@PathVariable Integer userId,@RequestBody Expense expense) {
        System.out.println(expense);
        return userRepository.getUser(userId).addExpense(expense);
    }

    @GetMapping("/user/{userId}/expenses")
    LinkedList<Expense> getUserExpenses(@PathVariable Integer userId) {
        return userRepository.getUser(userId).getExpenses();
    }




}
