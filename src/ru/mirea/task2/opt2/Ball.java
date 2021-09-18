package ru.mirea.task2.opt2;

public class Ball {
    int size;
    String color;
    String sports;
    public Ball(int size, String color, String sports){
        this.size=size;
        this.color=color;
        this.sports=sports;
    }
    public String toString(){
        return sports+" ball, size: "+size+", color: "+color;
    }
}
