package ru.mirea.task3.opt2;

public class Leg {
    int length;
    int strength;
    public Leg(int length, int strength){
        this.length=length;
        this.strength=strength;
    }

    public int getLength() {
        return length;
    }

    public int getStrength() {
        return strength;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void running(){
        System.out.println("I'm running");
    }
}
