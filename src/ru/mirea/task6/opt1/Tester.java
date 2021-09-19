package ru.mirea.task6.opt1;

public class Tester {

    public static void main(String args[]){
        Nameable car = new Car("Nissan");
        Nameable animal = new Animal("Goat");
        Nameable planet = new Planet("Earth");

        System.out.println(car.getName());
        System.out.println(animal.getName());
        System.out.println(planet.getName());
    }
}
