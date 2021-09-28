package ru.mirea.task8.opt3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.InputStream;

public class App3 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        InputStream input = getClass().getResourceAsStream("Weekness.gif");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(300);
        Group group=new Group(imageView);
        Scene scene=new Scene(group);
        stage.setScene(scene);
        stage.setTitle("speach 100");
        stage.sizeToScene();
        stage.show();
    }
}
