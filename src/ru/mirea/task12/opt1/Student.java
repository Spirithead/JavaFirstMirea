package ru.mirea.task12.opt1;

import java.util.Random;

public class Student {
    public int iDNumber;
    public int mark;
    static int count=0;
    public int name;
    public Student(){
        Random rnd=new Random();
        iDNumber=rnd.nextInt((20 - 1) + 1) + 1;
        mark=rnd.nextInt((5 - 1) + 1) + 1;
        count++;
        name=count;
    }

    @Override
    public String toString() {
        return name+", mark: "+mark;
    }
}
