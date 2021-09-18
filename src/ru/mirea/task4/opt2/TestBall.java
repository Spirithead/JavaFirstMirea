package ru.mirea.task4.opt2;

public class TestBall {
    public static void main(String args[]){
        Ball ball1=new Ball();
        Ball ball2=new Ball(3.0,5.5);
        ball1.setX(4.8);
        ball1.setY(7.2);
        System.out.println("x:"+ ball1.getX());
        System.out.println("y:"+ ball1.getY());

        ball2.move(3.1,-6.0);
        System.out.println(ball2.toString());
    }
}
