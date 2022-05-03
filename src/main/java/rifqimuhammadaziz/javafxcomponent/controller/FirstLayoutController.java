package rifqimuhammadaziz.javafxcomponent.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
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
        secondStage.setTitle("Second Layout");
        secondStage.setScene(scene);
        secondStage.initOwner(rootVBox.getScene().getWindow());
        secondStage.show();
    }

    @FXML
    private void openThirdLayoutAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("multi-windows/third-layout.fxml"));
        Stage thirdStage = new Stage();
        Scene scene = new Scene(fxmlLoader.load());
        thirdStage.setTitle("Third Layout");
        thirdStage.setScene(scene);
        thirdStage.initOwner(rootVBox.getScene().getWindow());
        thirdStage.initModality(Modality.WINDOW_MODAL); // cannot access main layout
        thirdStage.show();
    }

    @FXML
    private void openFouthLayoutAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("multi-windows/fourth-layout.fxml"));
        Stage fourthStage = new Stage();
        Scene scene = new Scene(fxmlLoader.load());
        fourthStage.setTitle("Fourth Layout");
        fourthStage.setScene(scene);
        fourthStage.initOwner(rootVBox.getScene().getWindow());
        fourthStage.initModality(Modality.APPLICATION_MODAL); // cannot access all event (all layout) until this layout is closed
        fourthStage.show();
    }
}
