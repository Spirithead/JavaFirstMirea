package ru.mirea.task3.opt1;

public class Circle {
    int radius;
    String color;
    public Circle(int radius, String color){
        this.color=color;
        this.radius=radius;
    }
    public int getRadius(){return radius;}
    public String getColor(){return color;}
    public void setRadius(int radius){this.radius=radius;}
    public void setColor(String color){this.color = color;}
    public String toString(){
        return "radius: "+radius+", color: "+color;
    }
}
