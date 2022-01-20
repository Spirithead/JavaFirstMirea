package ru.mirea.task19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s=0;
        try{
            s=test(sc.nextInt(),sc.nextInt());
        }
        catch (PersonalException e){
            s=1;
        }
        System.out.println(s);
    }

    public static int test(int a,int b) throws PersonalException {
        int s=0;
        if(a<=b) throw new PersonalException("aboba");
        else{
            s=a+b;
        }
        return s;
    }
}
