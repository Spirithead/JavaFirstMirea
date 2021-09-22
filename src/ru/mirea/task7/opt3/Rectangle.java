package ru.mirea.task7.opt3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        super();
        width=0;
        length=0;
    }
    public Rectangle(double width, double length){
        super();
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double s;
        s=width*length;
        return s;
    }

    @Override
    public double getPerimeter() {
        double p;
        p=2*(width+length);
        return p;
    }

    @Override
    public String toString() {
        return "Rectangle: width - "+width+"length - "+length+", color - "+color+", filled - "+filled;
    }
}
