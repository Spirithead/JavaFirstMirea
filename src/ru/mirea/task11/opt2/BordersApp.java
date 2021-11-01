package ru.mirea.task11.opt2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BordersApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane root;
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("bordersInter.fxml"));
        root=loader.load();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
