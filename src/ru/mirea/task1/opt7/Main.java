package ru.mirea.task1.opt7;

public class Main {
    public static void main(String args[]){
        factorial(4);
    }
    static void factorial(int n){
        int s=1;
        for(int i=2;i<=n;i++){
            s*=i;
        }
        System.out.println(s);
    }
}

