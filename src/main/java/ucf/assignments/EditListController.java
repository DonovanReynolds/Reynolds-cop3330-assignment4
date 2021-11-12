package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EditListController {


    private SceneSwap swap = new SceneSwap();

    @FXML
    private TextField nameInput;

    @FXML
    private Button submitButton;

    private static ToDoList tempList;

    public static void setTempList(ToDoList list)
    {
        tempList = list;
    }

    @FXML
    protected void onButtonPush(ActionEvent event) throws IOException {
        //get name from nameInput
        System.out.println("IM HERER");
        //set name of the newList to the name input
        if (nameInput.getText().isEmpty())
        {
            nameInput.setText("Invalid Input");
            swap.switchToCreateNewList(event);
            return;
        }

        CatalogScreenController.changeName(nameInput.getText() , tempList);
        swap.switchToCatalogScreen(event);
    }
}
