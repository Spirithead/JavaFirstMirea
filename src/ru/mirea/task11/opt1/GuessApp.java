package ru.mirea.task11.opt1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Random;

public class GuessApp extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Random rnd=new Random();
        AnchorPane root;
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("GuessInterface.fxml"));
        root=loader.load();
        loader.<GuessController>getController().target= rnd.nextInt((20 - 1) + 1) + 1;
        Label label = new Label(String.valueOf(loader.<GuessController>getController().target));
        root.getChildren().add(label);
        label.setLayoutY(300);
        label.setLayoutX(200);
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
