package rifqimuhammadaziz.javafxcomponent.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import rifqimuhammadaziz.javafxcomponent.entity.Student;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtLastName;
    @FXML
    private ComboBox<Student> comboStudent;
    @FXML
    private TableView<Student> tableStudent;
    @FXML
    private TableColumn<Student, String> colId;
    @FXML
    private TableColumn<Student, String> colName;

    private ObservableList<Student> students;

    @FXML
    private void resetAction(ActionEvent actionEvent) {
        resetForm();
    }

    @FXML
    private void saveAction(ActionEvent actionEvent) {
        if (txtId.getText().trim().isEmpty() || txtFirstName.getText().trim().isEmpty() || txtLastName.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Field cannot be empty!");
            alert.showAndWait();
        } else {
            Student student = new Student();
            student.setId(txtId.getText().trim());
            student.setFirstName(txtFirstName.getText().trim());
            student.setLastName(txtLastName.getText().trim());
            students.add(student);
            resetForm();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        students = FXCollections.observableArrayList();
        comboStudent.setItems(students);
        tableStudent.setItems(students);
        colId.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getId()));
        colName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getFirstName() + " " + data.getValue().getLastName()));
    }

    private void resetForm() {
        txtId.clear();
        txtFirstName.clear();
        txtLastName.clear();
        txtId.requestFocus();
    }
}
