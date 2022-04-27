module rifqimuhammadaziz.javafxcomponent {
    requires javafx.controls;
    requires javafx.fxml;


    opens rifqimuhammadaziz.javafxcomponent to javafx.fxml;
    exports rifqimuhammadaziz.javafxcomponent.controller;
    opens rifqimuhammadaziz.javafxcomponent.controller to javafx.fxml;
    exports rifqimuhammadaziz.javafxcomponent;
}