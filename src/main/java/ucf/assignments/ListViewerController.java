package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class ListViewerController {

    private SceneSwap swap = new SceneSwap();
    @FXML
    private TextArea listName;
    @FXML
    private TableView<ToDoItem> table;
    @FXML
    private TableColumn<ToDoItem,String> listNamesColumn;
    @FXML
    private TableColumn<ToDoItem,String> completeColumn;
    @FXML
    private CheckBox completed;
    @FXML
    private TextArea itemDescription;
    @FXML
    private TextArea itemDate;
    @FXML
    private TextArea itemName;

    @FXML
    public void seeAllItems(ActionEvent event)
    {
        //makes a temp list
        //adds all the items from the original list
        //displays the list
    }
    @FXML
    public void seeOnlyCompleteItems(ActionEvent event)
    {
        //make a temp list
        //adds all of the items from the orignal list with the true value for completed
        //displays the temp list
    }
    @FXML
    public void seeOnlyIncompleteItems(ActionEvent event)
    {
        //make a temp list
        //adds all of the items from the orignal list with the false value for completed
        //displays the temp list
    }
    @FXML
    public void returnToLists(ActionEvent event) throws IOException {
        //goes back to catalog screen
        swap.switchToCatalogScreen(event);
    }
    @FXML
    public void deleteItem(ActionEvent event) throws IOException {
        swap.switchToConfirmDelete(event);
        //if confirm is clicked deletes the item
    }
    @FXML
    public void editSelectedItem(ActionEvent event)
    {
        //gets the item that was selected
        //prompts the user for the item properties
        //update the item
    }
    @FXML
    public void newItemButton(ActionEvent event) throws IOException {
        //swaps to the new item screen
        swap.switchToAddItemScreen(event);


    }

}
