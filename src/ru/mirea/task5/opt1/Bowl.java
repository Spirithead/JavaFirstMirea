package ru.mirea.task5.opt1;

public class Bowl extends Dish{
    int radius;
    public Bowl(String material, String color, int radius){
        super(material, color);
        this.radius=radius;
    }
    public void crash(){
        System.out.println("Bowl is broken:(");
    }
    public void fillWithSoup(){
        System.out.println("I'm filled with soup");
    }
}
