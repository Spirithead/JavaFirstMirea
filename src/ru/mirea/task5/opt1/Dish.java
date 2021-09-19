package ru.mirea.task5.opt1;

public abstract class Dish {
    String material;
    String color;
    public Dish(String material, String color){
        this.material=material;
        this.color=color;
    }
    protected abstract void crash();
}
