package ru.mirea.task2.opt5;
import ru.mirea.task2.opt4.Dog;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDog {

    public static void main(String args[]){
        int quantity=5;
        List<Dog> dogs = new ArrayList();
        addDogs(dogs,quantity);
        for(int i=0;i<quantity;i++){System.out.println(dogs.get(i).toString());}
    }
    static void addDogs(List<Dog> dogs, int quantity){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<quantity;i++){
            System.out.println("Введите имя и возраст собаки:");
            Dog newDog = new Dog();
            dogs.add(newDog);
            newDog.setName(sc.next());
            newDog.setAge(sc.nextInt());
        }
    }

}
