package ru.mirea.task5.opt3;

public class Sofa extends Furniture {
    int softness;

    public Sofa(String material, String country,int softness){
        super(material, country);
        this.softness=softness;
    }

    public void lie(){
        System.out.println("Man is lying on me");
    }
}
