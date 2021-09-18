package ru.mirea.task3.opt2;

public class HumanTest {
    public static void main(String args[]){
        Human Igor = new Human(new Head(1000),new Hand(100,500),
                new Hand(100,500),new Leg(120,1000),
                new Leg(120,1000));
        Igor.thinking();
        Igor.punching();
        Igor.running();
    }
}
