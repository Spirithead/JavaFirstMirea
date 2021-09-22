package ru.mirea.task7.opt3;

public class Circle extends Shape{
    protected double radius;

    public Circle(){
        super();
        radius=0;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double s;
        s=Math.PI*radius*radius;
        return s;
    }

    @Override
    public double getPerimeter() {
        double p;
        p=2*Math.PI+radius;
        return p;
    }

    @Override
    public String toString() {
        return "Circle: radius - "+radius+", color - "+color+", filled - "+filled;
    }
}
