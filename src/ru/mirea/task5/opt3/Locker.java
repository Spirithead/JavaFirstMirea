package ru.mirea.task5.opt3;

public class Locker extends Furniture{
    int capacity;

    public Locker(String material, String country, int capacity){
        super(material, country);
        this.capacity=capacity;
    }

    public void hangUp(){
        System.out.println("Man hung up a coat in me");
    }
}
