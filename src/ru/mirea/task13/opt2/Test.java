package ru.mirea.task13.opt2;

import ru.mirea.task12.opt1.Student;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Student>students= new LinkedList<>();
        for(int i=0;i<5;i++){
            students.add(new Student());
        }
        for(Student i:students)System.out.print(i.toString()+'\n');
        System.out.print("\n-------------\n");
        students.add(3,new Student());
        for(Student i:students)System.out.print(i.toString()+'\n');
        System.out.print("\n-------------\n");
        System.out.print(students.peekFirst());
        System.out.print("\n-------------\n");
        System.out.print(students.pollLast().toString()+'\n');
        System.out.print("\n-------------\n");
        for(Student i:students)System.out.print(i.toString()+'\n');
        System.out.print("\n-------------\n");
        students.addFirst(new Student());
        for(Student i:students)System.out.print(i.toString()+'\n');
    }
}
