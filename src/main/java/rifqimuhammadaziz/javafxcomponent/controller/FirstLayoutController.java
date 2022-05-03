package rifqimuhammadaziz.javafxcomponent.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import rifqimuhammadaziz.javafxcomponent.MainApp;

import java.io.IOException;

public class FirstLayoutController {

    @FXML
    private VBox rootVBox;

    @FXML
    private void openAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("multi-windows/second-layout.fxml"));
        Stage secondStage = new Stage();
        Scene scene = new Scene(fxmlLoader.load());
        secondStage.setTitle("Hello!");
        secondStage.setScene(scene);
        secondStage.initOwner(rootVBox.getScene().getWindow());
        secondStage.show();
    }
}
