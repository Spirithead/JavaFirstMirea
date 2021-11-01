package ru.mirea.task12.opt2;

import ru.mirea.task12.opt1.Student;

public class SortingStudentsByGPA implements Comparator{
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for(int i=0;i<10;i++){
            students[i]=new Student();
            System.out.print(students[i].toString()+'\n');
        }

        System.out.print("----------------------");

        Comparator.quickSort(students,0, students.length-1);

        for(int i=0;i<10;i++){
            System.out.print(students[i].toString()+'\n');
        }
    }

}
