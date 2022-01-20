package ru.mirea.task18;

import TaskManager.Task;

import java.io.StringReader;
import java.util.Scanner;

public class TestName {
    public static void main(String[] args) {

        System.out.println("Введите название задачи:");
        boolean made=false;
        Scanner sc=new Scanner(System.in);
        while (!made){

            String name=sc.next();
            name=null;
            try {
                Task task1=new Task(name);
                if(name==null) throw new NullPointerException();
                made=true;
                System.out.println("Задача '"+task1.getName()+"' создана успешно ");
            }catch (NullPointerException e){
                System.out.println("У задачи должно быть название");
                made=false;
            }
        }

    }
}
