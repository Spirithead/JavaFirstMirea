package ru.mirea.task1.opt3;

public class Main {

    public static void main(String args[]){
        int[] a = new int[]{1,2,3,4,5};
        int s=0;
        for(int i=0;i<a.length;i++) {
            s+=a[i];
        }
        System.out.println(s);

        int t=0;
        s=0;
        while(t<a.length){
            s+=a[t];
            t++;
        }
        System.out.println(s);

        t=0;
        s=0;
        do {
            s+=a[t];
            t++;
        }while(t<a.length);
        System.out.println(s);
    }
}
