import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ucf.assignments.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import static ucf.assignments.ListViewerController.addItemToList;
import static ucf.assignments.ListViewerController.getList;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

public class CatalogScreenControllerTest {

    static ToDoList  list;
    static ArrayList<ToDoItem> tempList;

    @BeforeEach
    void init()
    {
        LocalDate cur = LocalDate.now();
        ToDoItem itemToAdd = new ToDoItem("TESTNAME","DESCRIPT",cur);
        ToDoItem itemToAdd2 = new ToDoItem("TESTNAME2","DESCRIPT2",cur);
        ToDoItem itemToAdd3 = new ToDoItem("TESTNAME3","DESCRIPT3",cur);
        addItemToList(itemToAdd);
        addItemToList(itemToAdd2);
        addItemToList(itemToAdd3);

        tempList =  getList();

        list = new ToDoList("THIS IS MY LIST");
        list.addItem(itemToAdd);
        list.addItem(itemToAdd2);
        list.addItem(itemToAdd3);
    }


    @Test
    void createNewTest()
    {
        //create a new list
        CatalogScreenController.addList(list);
        //see if the new list gets created with the proper name
        Assertions.assertTrue(list.getName().equalsIgnoreCase("THIS IS MY LIST"));
    }

    @Test
    void renameTest()
    {
        //create a new list
        CatalogScreenController.addList(list);
        //set name to be something
        //call edit name
        CatalogScreenController.changeName("THIS IS THE NEW NAME", list);
        //see if the two lists match names
        Assertions.assertTrue(list.getName().equalsIgnoreCase("THIS IS THE NEW NAME"));
    }



    @Test
    void deleteTest()
    {
        CatalogScreenController.deleteList(list);

        Assertions.assertFalse(CatalogScreenController.getCatalogLists().contains(list));
    }
}
