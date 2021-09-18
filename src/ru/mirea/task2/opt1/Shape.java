package ru.mirea.task2.opt1;

public class Shape {
    String type;
    String color;
    int dimensions;
    int dimensionX=0;
    int dimensionY=0;
    int dimensionZ=0;
    public Shape(String type, String color, int dimensions, int x){
        this.type=type;
        this.color=color;
        this.dimensions=dimensions;
        dimensionX=x;
    }

    public Shape(String type, String color, int dimensions, int x, int y){
        this.type=type;
        this.color=color;
        this.dimensions=dimensions;
        dimensionX=x;
        dimensionY=y;
    }

    public Shape(String type, String color, int dimensions, int x, int y,int z){
        this.type=type;
        this.color=color;
        this.dimensions=dimensions;
        dimensionX=x;
        dimensionY=y;
        dimensionZ=z;
    }

    public String toString(){
        return "type: "+type+", dimensions: "+dimensions+", scale: "+dimensionX+", "+dimensionX+", "
                +dimensionZ+", color: "+color;
    }
}
