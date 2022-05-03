package rifqimuhammadaziz.javafxcomponent.controller.sharingData;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import rifqimuhammadaziz.javafxcomponent.controller.sharingData.MainControllerNew;
import rifqimuhammadaziz.javafxcomponent.entity.Citizen;

import java.net.URL;
import java.util.ResourceBundle;

public class SecondControllerNew implements Initializable {

    @FXML
    private TableView<Citizen> tableCitizen;
    @FXML
    private TableColumn<Citizen, String> colId;
    @FXML
    private TableColumn<Citizen, String> colName;

    private MainControllerNew mainControllerNew;

    public void setMainController(MainControllerNew mainControllerNew) {
        this.mainControllerNew = mainControllerNew;
        tableCitizen.setItems(mainControllerNew.getCitizens());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colId.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getId()));
        colName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getFirstName() + " " + data.getValue().getLastName()));
    }
}
