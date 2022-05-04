package rifqimuhammadaziz.javafxcomponent.controller.sharingData;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import rifqimuhammadaziz.javafxcomponent.entity.Citizen;

import java.net.URL;
import java.util.ResourceBundle;

public class FirstController implements Initializable {
    
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtLastName;
    @FXML
    private TableView<Citizen> tableCitizen;
    @FXML
    private TableColumn<Citizen, String> colId;
    @FXML
    private TableColumn<Citizen, String> colFName;
    @FXML
    private TableColumn<Citizen, String> colLName;

    private MainController mainControllerNew;

    public void setMainController(MainController mainControllerNew) {
        this.mainControllerNew = mainControllerNew;
        tableCitizen.setItems(mainControllerNew.getCitizens());
    }

    @FXML
    private void saveAction(ActionEvent actionEvent) {
        // TODO Create Validation
        Citizen citizen = new Citizen();
        citizen.setId(txtId.getText());
        citizen.setFirstName(txtFirstName.getText());
        citizen.setLastName(txtLastName.getText());
        mainControllerNew.getCitizens().add(citizen);

        // Clear text field
        txtId.clear();
        txtFirstName.clear();
        txtLastName.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colId.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getId()));
        colFName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getFirstName()));
        colLName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getLastName()));
    }
}
