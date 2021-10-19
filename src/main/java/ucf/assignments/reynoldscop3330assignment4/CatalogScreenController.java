package ucf.assignments.reynoldscop3330assignment4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class CatalogScreenController {

    private SceneSwap swap = new SceneSwap();

    @FXML
    public void saveListButton(ActionEvent event) {
        //Save the current list selected
    }
    @FXML
    public void saveAllListsButton (ActionEvent event) throws IOException{
        //Save all of the lists in the catalog
    }
    @FXML
    public void renameButton(ActionEvent event)
    {
        //allows you to change the name of the selected list
    }
    @FXML
    public void newButton(ActionEvent event) throws IOException {
        swap.switchToCreateNewList(event);
    }
    @FXML
    public void deleteButton(ActionEvent event) throws IOException {
        swap.switchToConfirmListDelete(event);
    }



}
