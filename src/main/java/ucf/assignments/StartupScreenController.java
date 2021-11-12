package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Donovan Reynolds
 */

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
    protected void onLoadAllPush(ActionEvent event) throws IOException {
        Catalog catalog = DataUtil.loadLists();
        assert catalog != null;
        CatalogScreenController.setAllLists(catalog);
        swap.switchToCatalogScreen(event);
        //load every list able then switch scenes

    }
}
