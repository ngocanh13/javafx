package javafx.controller;

import javafx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class CreateController {

    public void backList(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../javafx/fxml/car/customerinformation.fxml"));

        Main.rootStage.setScene(new Scene(root, 800, 600));
    }
}
