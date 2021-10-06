package ru.mirea.task9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Football extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane root = new AnchorPane();
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("Highlights.fxml"));
        root = loader.load();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
