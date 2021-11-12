package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class ToDoItem {

    private SimpleStringProperty name;
    private SimpleStringProperty description;
    private LocalDate date;
    private SimpleBooleanProperty isComplete;

    public ToDoItem(String name, String description, LocalDate date) {
        this.name = new SimpleStringProperty(name);
        this.description = new SimpleStringProperty(description);
        this.date = date;
        this.isComplete = new SimpleBooleanProperty(false);
    }

    public ToDoItem(String name, String description, LocalDate date, boolean isComplete) {
        this.name = new SimpleStringProperty(name);
        this.description = new SimpleStringProperty(description);
        this.date = date;
        this.isComplete = new SimpleBooleanProperty(isComplete);
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

    public boolean isIsComplete() {
        return isComplete.get();
    }

    public SimpleBooleanProperty isCompleteProperty() {
        return isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete.set(isComplete);
    }

    @Override
    public String toString() {
        return name.get();
    }
}
