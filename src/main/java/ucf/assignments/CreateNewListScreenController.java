package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CreateNewListScreenController {

    private SceneSwap swap = new SceneSwap();

    @FXML
    private TextField nameInput;

    @FXML
    private Button submitButton;

    @FXML
    protected void onButtonPush(ActionEvent event) throws IOException {
        //get name from nameInput
        //set name of the newList to the name input
        if (nameInput.getText().isEmpty())
        {
            nameInput.setText("Invalid Input");
            swap.switchToCreateNewList(event);
            return;
        }

        CatalogScreenController.addList(new ToDoList(nameInput.getText()));
        swap.switchToCatalogScreen(event);
    }
}
