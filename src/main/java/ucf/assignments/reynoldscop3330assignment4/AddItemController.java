package ucf.assignments.reynoldscop3330assignment4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddItemController {

    private SceneSwap swap = new SceneSwap();

    @FXML
    private TextField Name;
    @FXML
    private TextField Description;
    @FXML
    private DatePicker date;

    @FXML
    public void SwitchToListViewer(ActionEvent event) throws IOException {
        //get the names in the fields and make a new item object with these
        swap.switchToListViewer(event);
    }



}
