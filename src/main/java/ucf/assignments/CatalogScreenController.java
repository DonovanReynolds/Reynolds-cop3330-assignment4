package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CatalogScreenController implements Initializable {

    private SceneSwap swap = new SceneSwap();

    @FXML
    private TableView<ToDoList> table = new TableView<>();
    @FXML
    private TableColumn<ToDoList, String> nameColumn;
    @FXML
    private TableColumn<ToDoList, String> sizeColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //initializes the table as soon as the scene is changed to this one
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        sizeColumn.setCellValueFactory(new PropertyValueFactory<>("size"));

        ObservableList<ToDoList> allLists = FXCollections.observableArrayList();

    }



    @FXML
    public void saveListButton(ActionEvent event) {
        //gets the current selected list
        //saves the current selected list
    }
    @FXML
    public void saveAllListsButton (ActionEvent event) throws IOException{
        //Save all of the lists in the catalog
    }
    @FXML
    public void renameButton(ActionEvent event)
    {
        //if lists is selected change scene to rename
        //prompts for a new name to change to
        //update the lists name
    }
    @FXML
    public void newButton(ActionEvent event) throws IOException {
        swap.switchToCreateNewList(event);
    }
    @FXML
    public void deleteButton(ActionEvent event) throws IOException {
        //gets the selected items as a list
        swap.switchToConfirmListDelete(event);
        //if confirm is selected then deletes the lists
    }



}
