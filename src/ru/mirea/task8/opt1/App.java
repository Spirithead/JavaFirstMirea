package ru.mirea.task8.opt1;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        Group group = new Group();
        int width=400;
        int height=400;
        Color[] colors = {Color.RED, Color.BLACK, Color.BLUE, Color.BURLYWOOD, Color.CYAN};

        for(int i=0;i<20;i++){
            int randShape=randInt(2);
            switch (randShape){
                case 0:
                    group.getChildren().add(new Circle(randInt(width),randInt(height),30,
                            colors[randInt(4)]));
                    break;
                case 1:
                    Rectangle rect = new Rectangle(30,30,colors[randInt(4)]);
                    rect.setX(randInt(width));
                    rect.setY(randInt(height));
                    group.getChildren().add(rect);
                    break;
                case 2:
                    Ellipse ellipse = new Ellipse(randInt(width),randInt(height),20,40);
                    ellipse.setFill(colors[randInt(4)]);
                    group.getChildren().add(ellipse);
                    break;
            }
        }

        Scene scene = new Scene(group);

        stage.setScene(scene);
        stage.setTitle("che-to krasivoe");
        stage.setWidth(400);
        stage.setHeight(400);
        stage.show();
    }

    public int randInt(int max){
        return (int)(Math.random()* ++max);
    }
}
