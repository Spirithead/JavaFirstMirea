package ru.mirea.task11.opt2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import ru.mirea.task7.opt3.Rectangle;

public class BordersController {
    String border;
    String color;
    @FXML
    void greetingsCenter(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Greetings");
        alert.setHeaderText(null);
        alert.setContentText("Welcome to Center");
        alert.showAndWait();
    }
    @FXML
    void greetingsNorth(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Greetings");
        alert.setHeaderText(null);
        alert.setContentText("Welcome to North");
        alert.showAndWait();
    }
    @FXML
    void greetingsWest(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Greetings");
        alert.setHeaderText(null);
        alert.setContentText("Welcome to West");
        alert.showAndWait();
    }
    @FXML
    void greetingsEast(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Greetings");
        alert.setHeaderText(null);
        alert.setContentText("Welcome to East");
        alert.showAndWait();
    }
    @FXML
    void greetingsSouth(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Greetings");
        alert.setHeaderText(null);
        alert.setContentText("Welcome to South");
        alert.showAndWait();
    }
}
