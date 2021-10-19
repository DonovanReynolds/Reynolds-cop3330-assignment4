package ucf.assignments.reynoldscop3330assignment4;

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
        swap.switchToListViewer(event);
    }
}
