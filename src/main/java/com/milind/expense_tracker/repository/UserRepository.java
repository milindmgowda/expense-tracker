package com.milind.expense_tracker.repository;


import com.milind.expense_tracker.model.User;

import java.util.ArrayList;

public class UserRepository {

    private static UserRepository instance;
    ArrayList<User> users;


    public UserRepository() {
        users = new ArrayList<>();
    }

    public static UserRepository getInstance() {
        if(instance==null) return new UserRepository();
        return instance;
    }

    public User addUser(User user) {
        users.add(user);
        return user;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User getUser(int i) {
        if(users.size() > i) return users.get(i);
        return null;
    }

}
