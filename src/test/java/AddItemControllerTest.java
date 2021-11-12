import org.junit.jupiter.api.Test;
import ucf.assignments.ListViewerController;
import ucf.assignments.StartupScreenController;
import ucf.assignments.ToDoItem;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.*;
import static ucf.assignments.ListViewerController.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

public class AddItemControllerTest {
    @Test
    void itemAddedTest()
    {
        //tests to see if the item is added to the list properly
        LocalDate cur = LocalDate.now();
        ToDoItem itemToAdd = new ToDoItem("TESTNAME","DESCRIPT",cur);
        addItemToList(itemToAdd);

        ArrayList<ToDoItem> tempList =  getList();

        Assertions.assertTrue(tempList.contains(itemToAdd));
    }
}

