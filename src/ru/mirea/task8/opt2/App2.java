package ru.mirea.task8.opt2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.InputStream;

public class App2 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        InputStream input = getClass().getResourceAsStream("f3KGIXnQRiM.jpg");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(500);
        imageView.setPreserveRatio(true);
        Group group = new Group(imageView);
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("dai lapu");
        stage.sizeToScene();
        stage.show();
    }
}


