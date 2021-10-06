package ru.mirea.task10.opt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        cycle(sc.nextInt());
    }
    static void cycle(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
        }
    }
}


