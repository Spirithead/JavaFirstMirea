package ru.mirea.task13.opt1;
import ru.mirea.task12.opt1.Student;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students =new ArrayList<>();
        for(int i=0;i<5;i++){
            students.add(new Student());
        }
        for(Student i:students)System.out.print(i.toString()+'\n');
        System.out.print("\n-------------\n");
        System.out.print(students.get(4).toString());
        System.out.print("\n-------------\n");
        students.set(4,new Student());
        System.out.print(students.get(4).toString());
        System.out.print("\n-------------\n");
        students.add(new Student());
        for(Student i:students)System.out.print(i.toString()+'\n');
        System.out.print("\n-------------\n");
        students.clear();

        ArrayList<Integer> a=new ArrayList<>(10);
        for(int i=0;i<5;i++){
            a.add(i);
        }
        for(int i=0;i<a.size();i++)System.out.println(a.get(i));
        System.out.println(a.set(2,10));
    }
}
