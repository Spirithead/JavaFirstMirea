package ru.mirea.task10.opt17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print(max());
    }

    static int max(){
        Scanner sc=new Scanner(System.in);
        int max=0;
        int current;
        do{
            current=sc.nextInt();
            if(current>max){
                max=current;
            }
        }while (current!=0);

        return max;
    }
}
