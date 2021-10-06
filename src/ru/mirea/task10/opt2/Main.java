package ru.mirea.task10.opt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        cycle(sc.nextInt());
    }
    static void cycle(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i);
        }
    }
}
