package javafx.controller;

import javafx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;





import java.io.IOException;



public class HomeController {

    public void goToCar(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/car/customerInformation.fxml"));

        Main.rootStage.setScene(new Scene(root, 800, 600));
    }


}