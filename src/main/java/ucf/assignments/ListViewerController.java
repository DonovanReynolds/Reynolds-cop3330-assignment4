package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ListViewerController implements Initializable {

    private SceneSwap swap = new SceneSwap();
    @FXML
    private Label listName;
    @FXML
    private TableView<ToDoItem> table;
    @FXML
    private TableColumn<ToDoItem,String> listNamesColumn;
    @FXML
    private TableColumn<ToDoItem,Boolean> completeColumn;
    @FXML
    private CheckBox completed;
    @FXML
    private TextArea itemDescription;
    @FXML
    private TextField itemDate;
    @FXML
    private TextField itemName;

    private int currentView;

    private static ToDoItem selectedItem;

    private static String listTitle;

    private static ArrayList<ToDoItem> allItems = new ArrayList<>();



    public static ArrayList<ToDoItem> getList()
    {
        return allItems;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //initializes the table as soon as the scene is changed to this one
        listNamesColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        completeColumn.setCellValueFactory(new PropertyValueFactory<>("isComplete"));

        System.out.println(allItems);
        ObservableList<ToDoItem> allItemsList = FXCollections.observableArrayList(ListViewerController.allItems);
        table.setItems(allItemsList);
        listName.setText(listTitle);

        table.getSelectionModel().selectedIndexProperty().addListener(
                (v,oldValue, newValue) ->  setSelected(newValue.intValue())
        );


    }

    public static void setList(ToDoList list)
    {
        allItems = list.getAllItems();
        listTitle = list.getName();
    }

    private void setSelected(int newValue)
    {
        if (newValue == -1)
        {
            showItem(null);
            return;
        }

        ToDoItem item = table.getItems().get(newValue);
        selectedItem = item;
        showItem(item);
    }

    public static void deleteItem()
    {
        allItems.remove(selectedItem);
        selectedItem = null;
    }

    private void showItem(ToDoItem newValue)
    {
        if (newValue == null)
        {
            itemName.setText("");
            itemDescription.setText("");
            itemDate.setText("");
            return;
        }

        itemName.setText(newValue.getName());
        itemDescription.setText(newValue.getDescription());
        itemDate.setText(newValue.getDate().toString());
        completed.setSelected(newValue.isIsComplete());


    }

    public static void addItemToList(ToDoItem item)
    {
        allItems.add(item);
        for(ToDoItem x: allItems)
        {
            System.out.println(x.getName() + ":   " + x.getDescription() + ":   " + x.isIsComplete() + ":   " + x.getDate());
        }
    }

    @FXML
    public void markAsComplete(ActionEvent event)
    {
        selectedItem.setIsComplete(completed.isSelected());
        if (currentView == 0)
            seeAllItems(event);
        if (currentView == 1)
            seeOnlyCompleteItems(event);
        if (currentView == 2)
            seeOnlyIncompleteItems(event);

    }


    @FXML
    public void seeAllItems(ActionEvent event)
    {
        //makes a temp list
        ObservableList<ToDoItem> allItemsList = FXCollections.observableArrayList(ListViewerController.allItems);
        //adds all the items from the original list
        table.setItems(allItemsList);
        //displays the list
        currentView = 0;
    }
    @FXML
    public void seeOnlyCompleteItems(ActionEvent event)
    {
        //make a temp list
        ArrayList<ToDoItem> completedItems = new ArrayList<>();
        //adds all of the items from the orignal list with the true value for completed
        for (ToDoItem item: allItems)
        {
            if (item.isIsComplete())
                completedItems.add(item);
        }
        ObservableList<ToDoItem> completedItemsList = FXCollections.observableArrayList(completedItems);
        table.setItems(completedItemsList);

            //displays the temp list
        currentView = 1;

    }
    @FXML
    public void seeOnlyIncompleteItems(ActionEvent event)
    {
        //make a temp list
        ArrayList<ToDoItem> incompletedItems = new ArrayList<>();
        //adds all of the items from the orignal list with the false value for completed
        for (ToDoItem item: allItems)
        {
            if (!item.isIsComplete())
                incompletedItems.add(item);
        }
        ObservableList<ToDoItem> incompletedItemsList = FXCollections.observableArrayList(incompletedItems);
        //displays the temp list
        table.setItems(incompletedItemsList);
        currentView = 2;
    }
    @FXML
    public void returnToLists(ActionEvent event) throws IOException {
        //goes back to catalog screen

        swap.switchToCatalogScreen(event);
    }
    @FXML
    public void deleteItem(ActionEvent event) throws IOException {
        if (selectedItem!=null)
            swap.switchToConfirmDelete(event);
        //if confirm is clicked deletes the item
    }
    @FXML
    public void editSelectedItem(ActionEvent event)
    {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-d");
        if (selectedItem == null)
        {
            return;
        }
        //update the item
        String nameText = itemName.getText();
        String descriptionText = itemDescription.getText();
        LocalDate date = null;
        try{
             date = LocalDate.parse(itemDate.getText(),format);
        }
        catch(DateTimeException e)
        {
            itemDate.setText("Invalid Date please use format yyyy-mm-d");
            return;
        }


        selectedItem.setDate(date);
        selectedItem.setName(nameText);
        selectedItem.setDescription(descriptionText);

    }
    @FXML
    public void newItemButton(ActionEvent event) throws IOException {
        //swaps to the new item screen
        swap.switchToAddItemScreen(event);

    }


}
