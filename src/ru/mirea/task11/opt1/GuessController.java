package ru.mirea.task11.opt1;

import javafx.fxml.FXML;

import javafx.scene.control.*;

import java.util.Random;

public class GuessController {
    int attempts=3;
    Random rnd=new Random();
    int current;
    public int target=rnd.nextInt(21);
    boolean succ=false;


    @FXML
    TextField input;
    @FXML
    Label label;
    @FXML
    void setNumber(){
        if(attempts>0){
            try {
                current=Integer.parseInt(input.getText());
                if(current==target){
                    label.setText("Верно!");
                    succ=true;
                }
                else label.setText("Неверное число");
            }
            catch (NumberFormatException e){
                label.setText("Неверный формат");
            }
            finally {
                attempts--;
            }


        }
        if((attempts<=0)&&(!succ)) label.setText("Не судьба");

    }
    public void setTarget(int target){
        this.target=target;
    }
}
