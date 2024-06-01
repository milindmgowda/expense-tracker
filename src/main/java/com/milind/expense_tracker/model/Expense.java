package com.milind.expense_tracker.model;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Expense {

    String expense_id;
    String name;
    List<String> category = new ArrayList<>();
    DateTime timeStamp;
    String description;
    Integer amount;
    String notes;

    public Expense(String name, List<String> category, Integer amount) {
        this.name = name;
        this.category = category;
        this.amount = amount;
    }

    public Expense(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
        this.timeStamp = new DateTime(DateTimeZone.UTC);

    }

    public Expense() {}

    public Expense(String name, List<String> category, String notes, Integer amount, String description, DateTime timeStamp) {
        this.name = name;
        this.category = category;
        this.notes = notes;
        this.amount = amount;
        this.description = description;
        this.timeStamp = timeStamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public DateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(DateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getExpense_id() {
        return expense_id;
    }

    public void setExpense_id(String expense_id) {
        this.expense_id = expense_id;
    }
}
