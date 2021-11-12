package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;

import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;

import static ucf.assignments.ListViewerController.addItemToList;

public class AddItemController {

    private SceneSwap swap = new SceneSwap();

    @FXML
    private TextField name;
    @FXML
    private TextArea description;
    @FXML
    private DatePicker date;

    @FXML
    public void SwitchToListViewer(ActionEvent event) throws IOException {
        //get the names in the fields and make a new item object with these
        {
            try
            {
                String nameText = name.getText();
                String descriptText = description.getText();
                LocalDate dateInput = date.getValue();
                if (nameText.isEmpty() || descriptText.isEmpty() || dateInput == null)
                {
                    throw new NullPointerException();
                }

                ToDoItem itemToAdd = new ToDoItem(nameText,descriptText,dateInput);
                addItemToList(itemToAdd);
                swap.switchToListViewer(event);
            }
            catch (NullPointerException e)
            {
                description.setText("Invalid input:" +
                        "\nMake sure there is a name field" +
                        "\nMake sure there is a description" +
                        "\nMake sure there is a date in the format yyyy-mm-d");
            }
        }




    }



}
