package ru.mirea.task12.opt3;

import ru.mirea.task12.opt1.Student;

public class Merge {
    public static void main(String[] args) {
        Student[] students1=new Student[5];
        Student[] students2=new Student[5];

        for(int i=0;i<5;i++) {
            students1[i] = new Student();
            System.out.print(students1[i].toString()+'\n');
        }
        System.out.print("------------"+'\n');
        for(int i=0;i<5;i++) {
            students2[i] = new Student();
            System.out.print(students2[i].toString()+'\n');
        }
        System.out.print("------------"+'\n');

        Student[] studentsAll=new Student[students1.length+ students2.length];
        System.arraycopy(students1, 0, studentsAll, 0, students1.length);
        System.arraycopy(students2,0,studentsAll,students1.length,students2.length);

        mergeSort(studentsAll,0, studentsAll.length-1);
        for(int i=0;i< studentsAll.length;i++)System.out.print(studentsAll[i].toString()+'\n');

    }
    public static void mergeSort(Student[] students, int left, int right) {

        int border = left + ((right - left) / 2) + 1;

        if (border > 0 && right > (left + 1)) {
            mergeSort(students, left, border - 1);
            mergeSort(students, border, right);
        }

        Student[] buffer = new Student[right - left + 1];

        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {

            if (border > right || students[cursor].mark > students[border].mark) {
                buffer[i] = students[cursor];
                cursor++;
            } else {
                buffer[i] = students[border];
                border++;
            }
        }
        System.arraycopy(buffer, 0, students, left, buffer.length);
    }
}
