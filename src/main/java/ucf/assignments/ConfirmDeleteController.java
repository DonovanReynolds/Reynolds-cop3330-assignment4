package ucf.assignments;

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
    protected boolean onConfirmClick(ActionEvent event) throws IOException {
        swap.switchToListViewer(event);
        return true;
    }

    @FXML
    protected boolean onCancelClick(ActionEvent event) throws IOException {
        //Go back to previous scene
        swap.switchToListViewer(event);
        return false;
    }
}
