package ru.mirea.task2.opt1;

public class Tester {
    public static void main(String args[]){
        Shape line = new Shape("lyne", "red",1,5);
        Shape rectangle = new Shape("rectangle", "blue", 2, 3,7);
        Shape cube = new Shape("cube", "white", 3, 5,5,5);
        System.out.println(line.toString());
        System.out.println(cube.toString());
        System.out.println(rectangle.toString());
    }
}
