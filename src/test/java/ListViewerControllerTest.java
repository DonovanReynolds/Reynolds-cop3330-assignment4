/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ucf.assignments.ToDoItem;

import java.util.ArrayList;

public class ListViewerControllerTest {

    ArrayList<ToDoItem> testList;
    @BeforeEach
    public void init()
    {
        testList = new ArrayList<>();
        //add stuff to the test list to use
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
