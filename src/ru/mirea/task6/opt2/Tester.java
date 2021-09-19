package ru.mirea.task6.opt2;

public class Tester {
    public static void main(String args[]){
        Priceable cookie = new Cookie(50);
        Priceable iceCream = new IceCream(60);

        System.out.println(cookie.getPrice());
        System.out.println(iceCream.getPrice());
    }
}
