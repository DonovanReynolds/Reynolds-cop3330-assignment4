package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AddItemController {

    private SceneSwap swap = new SceneSwap();

    @FXML
    private TextField name;
    @FXML
    private TextField description;
    @FXML
    private DatePicker date;

    @FXML
    public void SwitchToListViewer(ActionEvent event) throws IOException {
        //get the names in the fields and make a new item object with these
        swap.switchToListViewer(event);
    }



}
