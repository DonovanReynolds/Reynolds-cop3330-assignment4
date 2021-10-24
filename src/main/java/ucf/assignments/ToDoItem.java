package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class ToDoItem {

    private SimpleStringProperty name;
    private SimpleStringProperty description;
    private LocalDate date;
    private boolean isComplete;

    public ToDoItem(SimpleStringProperty name, SimpleStringProperty description, LocalDate date) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.isComplete = false;
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return name.get();
    }
}
