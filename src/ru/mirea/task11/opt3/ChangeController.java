package ru.mirea.task11.opt3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class ChangeController {
    @FXML
    TextArea input;
    @FXML
    Button blue;
    @FXML
    Button lightBlue;
    @FXML
    Button muchLighterBlue;
    @FXML
    Button calibri;
    @FXML
    Button comic;
    @FXML
    Button impact;
    @FXML
    void changeColor(ActionEvent event){
        String color="black";
        if(event.getSource() instanceof Button) color=((Button) event.getSource()).getText();
        switch (color) {
            case "black" -> input.setStyle(input.getStyle()+"; -fx-text-fill: BLACK");
            case "Blue" -> input.setStyle(input.getStyle()+"; -fx-text-fill: BLUE");
            case "LightBlue" -> input.setStyle(input.getStyle()+"; -fx-text-fill: CORNFLOWERBLUE");
            case "MuchLighterBlue" -> input.setStyle(input.getStyle()+"; -fx-text-fill: DEEPSKYBLUE");
        }
    }

    @FXML
    void changeFont(ActionEvent event){
        String font="";
        if(event.getSource() instanceof Button) font = ((Button) event.getSource()).getText();
        switch (font){
            case "Calibri"->input.setStyle(input.getStyle()+"; -fx-font-family: Calibri");
            case "Comic Sans"->input.setStyle(input.getStyle()+"; -fx-font-family: 'Comic Sans MS'");
            case "Impact"->input.setStyle(input.getStyle()+"; -fx-font-family: Impact");
        }
    }
}
