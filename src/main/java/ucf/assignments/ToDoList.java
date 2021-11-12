package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class ToDoList {

    private ArrayList<ToDoItem> allItems;
    private SimpleStringProperty name;
    private SimpleStringProperty size;

    public ToDoList(String name) {
        this.name = new SimpleStringProperty(name);
        size = new SimpleStringProperty("0");
        allItems = new ArrayList<>();
    }

    public ToDoList(String name, ArrayList<ToDoItem> allItems) {
        this.name = new SimpleStringProperty(name);
        size = new SimpleStringProperty(Integer.toString(allItems.size()));
        this.allItems = allItems;
    }



    public void addItem(ToDoItem item)
    {
        allItems.add(item);
        updateSize();
    }

    public void removeItem(ToDoItem item)
    {
        allItems.remove(item);
        updateSize();
    }

    public void editItem(ToDoItem old, ToDoItem updated)
    {
        allItems.remove(old);
        allItems.add(updated);
    }

    public void updateSize()
    {
        size = new SimpleStringProperty("" + allItems.size());
    }

    public ArrayList<ToDoItem> getAllItems() {
        return allItems;
    }

    public void setAllItems(ArrayList<ToDoItem> allItems) {
        this.allItems = allItems;
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

    public int getSize() {
        return Integer.parseInt(size.get());
    }

    public SimpleStringProperty sizeProperty() {
        System.out.println(size);
        return size;
    }

    public void setSize(String size) {
        this.size.set(size);
    }

    @Override
    public String toString() {
        return name.get();
    }
}
