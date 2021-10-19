package ucf.assignments.reynoldscop3330assignment4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ListViewerController {

    private SceneSwap swap = new SceneSwap();
    @FXML
    public void seeAllItems(ActionEvent event)
    {
        //swap to see all of the items in the list
    }
    @FXML
    public void seeOnlyCompleteItems(ActionEvent event)
    {
        //swap to see only the completed items in the list
    }
    @FXML
    public void seeOnlyIncompleteItems(ActionEvent event)
    {
        //swap to see only the incomplete items
    }
    @FXML
    public void returnToLists(ActionEvent event) throws IOException {
        swap.switchToCatalogScreen(event);
    }
    @FXML
    public void deleteItem(ActionEvent event) throws IOException {
        swap.switchToConfirmDelete(event);
    }
    @FXML
    public void editSelectedItem(ActionEvent event)
    {
        //gets the selected item and edits it
    }
    @FXML
    public void newItemButton(ActionEvent event) throws IOException {
        swap.switchToAddItemScreen(event);

    }

}
