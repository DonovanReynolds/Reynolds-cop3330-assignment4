/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

import javafx.event.ActionEvent;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ucf.assignments.ListViewerController;
import ucf.assignments.ToDoItem;
import ucf.assignments.ToDoList;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListViewerControllerTest {

    static ArrayList<ToDoItem> testList;
    ListViewerController test = new ListViewerController();
    static ToDoList list = new ToDoList("ListName");
    @BeforeAll
    public static void init()
    {
        testList = new ArrayList<>();
        //add stuff to the test list to use
        testList.add(new ToDoItem("NAME" , "Desciption", LocalDate.now()));
        testList.add(new ToDoItem("NAME2" , "Desciption2", LocalDate.now()));
        testList.add(new ToDoItem("NAME3" , "Desciption3", LocalDate.now()));
        testList.add(new ToDoItem("NAME4" , "Desciption4", LocalDate.now()));
        testList.add(new ToDoItem("NAME5" , "Desciption5", LocalDate.now()));

        testList.get(2).setIsComplete(true);
        testList.get(4).setIsComplete(true);

        list.setAllItems(testList);


    }

    @Test
    void seeAllItemsTest()
    {
        //click button for list to show all items
        //test against the test array
    }


    @Test
    void seeOnlyCompleteItems() {
        //click button to show only completed items
        //test against the test array
    }

    @Test
    void seeOnlyIncompleteItems() {
        //click button to show only incomplete items
        //test against the test array
    }

    @Test
    void deleteItem() {
        //make item to delete
        //click button to delete item
        //see if item properly gets deleted from list
    }

    @Test
    void editSelectedItem() {
        //click item
        //click edit
        //see if the element in the test array gets edited properly
    }

    @Test
    void newItemButton() {
        //click add new item
        //see if the item gets added properly to test array
    }

}
