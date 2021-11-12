import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ucf.assignments.*;

import java.time.LocalDate;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

public class CreateNewListScreenControllerTest {

    @Test
    void createNewListTest()
    {
        //create a random list with the same attributes
        ToDoList list = new ToDoList("This is my list");
        list.addItem(new ToDoItem("Name" , "Description", LocalDate.now()));
        CatalogScreenController.addList(list);
        // see that the list gets made properly
        Assertions.assertTrue(CatalogScreenController.getCatalogLists().contains(list));
    }

}
