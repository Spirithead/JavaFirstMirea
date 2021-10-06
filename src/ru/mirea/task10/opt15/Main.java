package ru.mirea.task10.opt15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        recurse(sc.nextInt());
    }

    static void recurse(int n){
        if(n>0){
            System.out.print(n%10+" ");
            recurse(n/10);
        }

    }
}
