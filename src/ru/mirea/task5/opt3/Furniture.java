package ru.mirea.task5.opt3;

public abstract class Furniture {
    String material;
    String country;

    public Furniture(String material,String country){
        this.material=material;
        this.country=country;
    }

    public void sellOut(){
        System.out.println("I'm sold out");
    }
}
