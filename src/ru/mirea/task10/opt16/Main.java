package ru.mirea.task10.opt16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print(max());
    }

    static int max(){
        Scanner sc=new Scanner(System.in);
        int n=0;
        int max=0;
        int current;
        do{
            current=sc.nextInt();
            if(current>max){
                max=current;
                n=0;
            }
            if(current==max)n++;
        }while (current!=0);

        return n;
    }
}
