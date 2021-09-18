package ru.mirea.task3.opt1;

public class CircleTest {
    public static void main(String args[]){
        Circle circle = new Circle(5,"red");
        System.out.println(circle.toString());
        circle.setColor("white");
        circle.setRadius(10);
        System.out.println(circle.toString());
    }
}
