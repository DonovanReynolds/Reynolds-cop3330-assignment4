package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

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
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CatalogScreenController implements Initializable {

    private SceneSwap swap = new SceneSwap();

    @FXML
    private TableView<ToDoList> table = new TableView<>();
    @FXML
    private TableColumn<ToDoList, String> nameColumn;
    @FXML
    private TableColumn<ToDoList, String> sizeColumn;


    private static ToDoList selectedList;
    private static ArrayList<ToDoList> allLists = new ArrayList<>();

    public static ArrayList<ToDoList> getCatalogLists()
    {
        return allLists;
    }

    public static void changeName(String name,ToDoList list)
    {
        list.setName(name);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //initializes the table as soon as the scene is changed to this one
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        sizeColumn.setCellValueFactory(new PropertyValueFactory<>("size"));
        for (ToDoList list: allLists)
        {
            list.updateSize();
        }
        ObservableList<ToDoList> allLists = FXCollections.observableArrayList(CatalogScreenController.allLists);
        table.setItems(allLists);


        table.getSelectionModel().selectedIndexProperty().addListener(
                (v,oldValue, newValue) ->  setSelected(newValue.intValue())
        );


    }

    public static void setAllLists(Catalog catalog)
    {
        allLists = catalog.getCatalog();
    }

    public static void deleteList()
    {
        allLists.remove(selectedList);
        selectedList = null;
    }

    public static void deleteList(ToDoList list)
    {
        allLists.remove(list);
    }

    private void setSelected(int newValue)
    {
        if (newValue == -1)
        {
            return;
        }

        selectedList = table.getItems().get(newValue);
    }

    public static void addList(ToDoList listToAdd)
    {
        allLists.add(listToAdd);
    }



    @FXML
    public void saveListButton(ActionEvent event) throws IOException {
        //gets the current selected list
        if (selectedList == null)
        {
            return;
        }
        DataUtil.saveOne(selectedList);
        //saves the current selected list
    }
    @FXML
    public void saveAllListsButton (ActionEvent event) throws IOException{
        //Save all of the lists in the catalog
        DataUtil.saveAll(new Catalog(allLists));
        System.out.println("Something happened");
    }
    @FXML
    public void renameButton(ActionEvent event) throws IOException {
        //if lists is selected change scene to rename
        if (selectedList!= null)
        {
            EditListController.setTempList(selectedList);
            swap.switchToEditListScreen(event);
        }

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
        if (selectedList!= null)
            swap.switchToConfirmListDelete(event);
        //if confirm is selected then deletes the lists
    }

    @FXML
    public void openButton(ActionEvent event) throws IOException {
        ListViewerController.setList(selectedList);
        swap.switchToListViewer(event);

    }



}
