package ucf.assignments.reynoldscop3330assignment4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class StartupScreenController {

    private SceneSwap swap = new SceneSwap();

    @FXML
    private Button create;

    @FXML
    private Button loadOne;

    @FXML
    private Button loadAll;

    @FXML
    protected void  onCreatePush(ActionEvent event) throws IOException {
        swap.switchToCreateNewList(event);
    }

    @FXML
    protected void onLoadOnePush(ActionEvent event)
    {
        //switch to the load one list scene
    }

    @FXML
    protected void onLoadAllPush()
    {
        //load every list able then switch scenes

    }
}
