package ru.mirea.task5.opt1;

public class Tester {
    public static void main(String args[]){
        Cup cup = new Cup("steel","grey",100);
        Bowl bowl =new Bowl("ceramic","white",50);

        bowl.fillWithSoup();
        cup.fillWithTea();
        bowl.crash();
        cup.crash();
    }
}
