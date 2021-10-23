package ucf.assignments;

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

    private void updateSize()
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

    public String getSize() {
        return size.get();
    }

    public SimpleStringProperty sizeProperty() {
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
