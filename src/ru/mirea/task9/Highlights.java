package ru.mirea.task9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Highlights {
    int scoreZen=0;
    int scoreSpa=0;

    @FXML
    Button buttonZen;
    @FXML
    Button buttonSpa;
    @FXML
    Label score;
    @FXML
    Label lastScored;
    @FXML
    Label winner;

    @FXML
    private void scoreZen(ActionEvent event){
        scoreZen++;
        score.setText(scoreZen+" : "+scoreSpa);
        lastScored.setText("Last Scorer: Zenit");
        if(scoreZen>scoreSpa) winner.setText("Winner: ZENIT");
        else if(scoreZen<scoreSpa) winner.setText("Winner: SPARTAK");
        else winner.setText("DRAW");
    }
    @FXML
    private void scoreSpa(ActionEvent event){
        scoreSpa++;
        score.setText(scoreZen+" : "+scoreSpa);
        lastScored.setText("Last Scorer: Spartak");
        if(scoreZen>scoreSpa) winner.setText("Winner: ZENIT");
        else if(scoreZen<scoreSpa) winner.setText("Winner: SPARTAK");
        else winner.setText("DRAW");
    }

}
