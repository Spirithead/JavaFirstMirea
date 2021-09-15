package ru.mirea.task1.opt4;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во аргументов");
        int n=sc.nextInt();
        String[] argum=new String[n];
        System.out.println("Введите аргументы");
        for(int i=0;i<n;i++){
            argum[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            System.out.println(argum[i]);
        }
    }
}
