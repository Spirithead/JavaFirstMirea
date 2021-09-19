package ru.mirea.task5.opt3;

public class Chair extends Furniture{
    int height;

    public Chair(String material,String country, int height){
        super(material, country);
        this.height=height;
    }
    public void sit(){
        System.out.println("Man is sitting on me");
    }
}
