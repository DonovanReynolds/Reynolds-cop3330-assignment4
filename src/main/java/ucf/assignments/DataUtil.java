package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DataUtil {

    private File file;


    DataUtil (String path) throws IOException {
        file = new File(path);
        if (!file.exists())
        {
            file.createNewFile();
        }
    }

    public static Catalog loadLists()
    {
        //gets the file for all of the lists
        //go through each list using a parser and make them lists
        //returns the list as a catalog
        return null;
    }

    public static Catalog loadLists(ArrayList<String> nameOfList)
    {
        //get the list of all lists
        //search through the list until the nameOfList is found
        //parse it
        //return as catalog
        return null;
    }

    public static boolean saveAll(Catalog catalog)
    {
        //Go through each list
            //parse each list into string
            //create a new file or overwrite current file
        //returns true if save was successful
        return false;
    }

    public static boolean saveOne(ToDoList list)
    {
        //Find the list to save
        //create a new file or overwrite current file
        //returns true if save was successful
        return false;
    }
}
