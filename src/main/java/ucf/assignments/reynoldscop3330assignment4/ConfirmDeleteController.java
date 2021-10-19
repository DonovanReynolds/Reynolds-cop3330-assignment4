package ucf.assignments.reynoldscop3330assignment4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class ConfirmDeleteController {

    private SceneSwap swap = new SceneSwap();

    @FXML
    private Button confirmButton;

    @FXML
    private Button cancelButton;

    @FXML
    protected void onConfirmClick(ActionEvent event) throws IOException {
        //Deletes list
        swap.switchToListViewer(event);
    }

    @FXML
    protected void onCancelClick(ActionEvent event) throws IOException {
        //Go back to previous scene
        swap.switchToListViewer(event);
    }
}
