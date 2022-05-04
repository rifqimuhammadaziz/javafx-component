package rifqimuhammadaziz.javafxcomponent.controller.sharingData;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import rifqimuhammadaziz.javafxcomponent.MainApp;
import rifqimuhammadaziz.javafxcomponent.entity.Citizen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private ObservableList<Citizen> citizens;
    
    @FXML
    private void closeAction(ActionEvent actionEvent) {
    }

    @FXML
    private void openFirstAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("send-data-between-layout/first-layout.fxml"));
        Parent root = fxmlLoader.load();
        FirstController controller = fxmlLoader.getController();
        controller.setMainController(this);
        Stage firstStage = new Stage();
        firstStage.setTitle("First Layout");
        firstStage.setScene(new Scene(root));
        firstStage.show();
    }

    @FXML
    private void openSecondAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("send-data-between-layout/second-layout.fxml"));
        Parent root = fxmlLoader.load();
        SecondController controller = fxmlLoader.getController();
        controller.setMainController(this);
        Stage secondStage = new Stage();
        secondStage.setTitle("Second Layout");
        secondStage.setScene(new Scene(root));
        secondStage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        citizens = FXCollections.observableArrayList();
    }

    public ObservableList<Citizen> getCitizens() {
        return citizens;
    }
}
