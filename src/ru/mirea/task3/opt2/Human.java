package ru.mirea.task3.opt2;

public class Human {
    public Head head;
    public Hand leftHand;
    public Hand rightHand;
    public Leg leftLeg;
    public Leg rightLeg;

    public Human(Head head, Hand leftHand, Hand rightHand, Leg leftLeg, Leg rightLeg){
        this.head=head;
        this.leftHand=leftHand;
        this.rightHand=rightHand;
        this.leftLeg=leftLeg;
        this.rightLeg=rightLeg;
    }
    public void thinking(){
        head.thinking();
    }
    public void punching(){
        leftHand.punching();
        rightHand.punching();
    }
    public void running(){
        leftLeg.running();
        rightLeg.running();
    }
}
