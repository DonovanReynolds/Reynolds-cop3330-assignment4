package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class DataUtil {



    public static Catalog loadLists() throws IOException {
        //get the list of all lists
        BufferedReader reader = FileUtil.makeReader("Saved_List");

        ArrayList<ToDoList> listTemp = new ArrayList<>();

        //search through the list until the nameOfList is found
        int index = -1;

        while(true)
        {
            String textIn = reader.readLine();
            //System.out.println(textIn);
            if (textIn == null)
            {
                break;
            }

            String[] splitUpString = textIn.split(":");
            if (splitUpString[0].equalsIgnoreCase("list"))
            {
                listTemp.add(new ToDoList(splitUpString[1]));
                index++;
            }

            if (splitUpString[0].equalsIgnoreCase("ITEM"))
            {
                String[] itemSplit = splitUpString[1].split(",");

                ToDoItem tempItem = new ToDoItem(itemSplit[0],itemSplit[2],LocalDate.parse(itemSplit[1]),Boolean.parseBoolean(itemSplit[3]));
                listTemp.get(index).addItem(tempItem);
            }
        }
        reader.close();
        //parse it
        //return as catalog
        return new Catalog(listTemp);
    }

    public static ToDoList loadLists(String nameOfList) throws IOException {

        Catalog temp = loadLists();

        for (ToDoList list : temp.getCatalog())
        {
            if (list.getName().equalsIgnoreCase(nameOfList))
                return list;
        }

        return null;
    }

    public static void saveAll(Catalog catalog) throws IOException {
        //Go through each list
        StringBuilder toPrint = new StringBuilder();
        for (ToDoList list: catalog.getCatalog())
        {
            toPrint.append("List:").append(list.getName()).append("\n");
            for (ToDoItem item :list.getAllItems())
            {
                toPrint.append("ITEM:").append(item.getName()).append(",").append(item.getDate()).append(",").append(item.getDescription()).append(",").append(item.isIsComplete()).append("\n");

            }

        }
        FileUtil.writeToFile(toPrint.toString() , "Saved_List");
            //parse each list into string
            //create a new file or overwrite current file
        System.exit(0);
    }

    public static void saveOne(ToDoList list) throws IOException {
        //Find the list to save
        StringBuilder toPrint = new StringBuilder();
        //create a new file or overwrite current file
        if (listExists(list, loadLists()))
            return;
        toPrint.append("List:").append(list.getName()).append("\n");
        for (ToDoItem item : list.getAllItems())
        {
                toPrint.append("ITEM:").append(item.getName()).append(",").append(item.getDate()).append(",").append(item.getDescription()).append(",").append(item.isIsComplete()).append("\n");

        }
        //returns true if save was successful
        System.out.println(toPrint);
        FileUtil.appendToFile(toPrint.toString(), "Saved_List");
    }

    private static boolean itemExists(ToDoItem test, ToDoList list)
    {
        for (ToDoItem item: list.getAllItems())
        {
            if (!item.getName().contains(test.getName()))
            {
                System.out.println("ITEM" + item.getName() + "    TEST" + test.getName());
                return false;
            }

            if (!item.getDescription().contains(test.getDescription()))
            {
                System.out.println("ITEM" + item.getDescription() + "    TEST" + test.getDescription());
                return false;
            }

            if (item.getDate().compareTo(test.getDate()) != 0)
            {
                System.out.println("ITEM" + item.getDate() + "    TEST" + test.getDate());
                return false;
            }

            if (Boolean.compare(item.isIsComplete() , test.isIsComplete()) != 0)
            {
                System.out.println("ITEM" + item.isIsComplete() + "    TEST" + test.isIsComplete());
                System.out.println("Look here dummy");
                System.out.println(Boolean.compare(item.isIsComplete() , test.isIsComplete()));
                return false;
            }

        }
        return true;

    }

    private static boolean listExists(ToDoList list, Catalog catalog)
    {
        boolean ret = false;
        for (ToDoList test : catalog.getCatalog())
        {
            System.out.println("THIS IS THE VAL OF LIST::" + test);
            if(test.getName().equalsIgnoreCase(list.getName()))
            {
                //System.out.println("TEST" + test.getName() + "       LIST::::" + list.getName() );
                ret = true;
            }

            if (test.getAllItems().isEmpty())
            {
                ret = list.getAllItems().isEmpty();
            }
            for (ToDoItem item : test.getAllItems())
            {
                System.out.println(" THIS IS THE VAL OF ITEM::" + item);
                 if (!itemExists(item, test))
                     return false;
            }
        }
        System.out.println("THIS IS RET:::" + ret);
        return ret;
    }




}
