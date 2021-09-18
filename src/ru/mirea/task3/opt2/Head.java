package ru.mirea.task3.opt2;

public class Head {
    int capacity;
    public Head(int capacity){
        this.capacity=capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void thinking(){
        System.out.println("I'm thinking");
    }
}
