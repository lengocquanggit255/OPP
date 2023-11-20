package org.openjfx.dictionary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DefaultGameMenuPaneController {
    @FXML
    private Button playGameButton, levelGameButton, homeButton;
    @FXML
    public AnchorPane defaultGameMenuPane;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML 
    public void startGame(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menuGamePane.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML 
    private void chooseLevelGame(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("levelGamePane.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML 
    public void comeBackHome(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Container.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
