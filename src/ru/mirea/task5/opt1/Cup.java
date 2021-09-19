package ru.mirea.task5.opt1;

public class Cup extends Dish{
    int capacity;
    public Cup(String material, String color, int capacity){
        super(material, color);
        this.capacity=capacity;
    }

    public void fillWithTea() {
        System.out.println("I'm filled with tea");
    }
    public void crash(){
        System.out.println("Cup is broken:(");
    }
}
