package javafx.controller;

import javafx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class listController {


    public void create(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/car/addController.fxml"));

        Main.rootStage.setScene(new Scene(root, 800, 600));
    }

    public void Back(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../../javafx/fxml/homePage.fxml"));

        Main.rootStage.setScene(new Scene(root, 800, 600));
    }
}
