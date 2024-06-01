package com.milind.expense_tracker.model;

import java.util.Iterator;
import java.util.LinkedList;

public class User {

    String name;
    LinkedList<Expense> expenses = new LinkedList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LinkedList<Expense> getExpenses() {
        return expenses;
    }

    public void addExpense(Expense expense) {
        this.expenses.add(expense);
    }

    public Expense getExpense(String expense_id) {
        for(Expense expense: this.expenses) {
            if(expense.getExpense_id().equals(expense_id)) return expense;
        }
        return null;
    }
}
