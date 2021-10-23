package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwap {


    private Stage stage;
    private Scene scene;
    private Parent root;

    public SceneSwap()
    {

    }



    public void switchToAddItemScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AddItemScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    public void switchToCatalogScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("CatalogScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    public void switchToConfirmDelete(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ConfirmDelete.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void switchToConfirmListDelete(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("ConfirmListDelete.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void switchToCreateNewList(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("CreateNewListScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void switchToListViewer(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ListViewerScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void switchToStartupScreen(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("ListViewerScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

}
