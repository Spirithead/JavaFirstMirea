package ru.mirea.task1.opt6;

import java.util.Random;

public class Main {
    public static void main(String args[]){
        int[] a1 = new int[5];
        int[] a2 = new int[5];
        int max = 10;
        int min=1;
        for(int i=0;i<5;i++){
            a1[i]=(int)(Math.random()*(max-min+1))+min;
            System.out.print(a1[i]+" ");
        }
        System.out.print('\n');

        Random rnd = new Random();
        for(int i=0;i<5;i++){
            a2[i]=rnd.nextInt(11);
            System.out.print(a2[i]+" ");
        }
        System.out.print('\n');
        System.out.println("-----------------");

        for(int i=0;i<5;i++){
            int imax=i;
            for(int j=i;j<5;j++){
                if(a1[j]>a1[imax])imax=j;
            }
            int t=a1[i];
            a1[i]=a1[imax];
            a1[imax]=t;
        }
        for(int i=0;i<5;i++){
            System.out.print(a1[i]+" ");
        }
        System.out.print('\n');

        for(int i=0;i<5;i++){
            int imax=i;
            for(int j=i;j<5;j++){
                if(a2[j]>a2[imax])imax=j;
            }
            int t=a2[i];
            a2[i]=a2[imax];
            a2[imax]=t;
        }

        for(int i=0;i<5;i++){
            System.out.print(a2[i]+" ");
        }
    }
}
