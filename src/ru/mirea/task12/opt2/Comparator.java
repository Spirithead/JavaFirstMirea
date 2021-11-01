package ru.mirea.task12.opt2;

import ru.mirea.task12.opt1.Student;

public interface Comparator {
    public static void quickSort(Student[] students, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = students[(leftMarker + rightMarker) / 2].mark;
        do {

            while (students[leftMarker].mark > pivot) {
                leftMarker++;
            }

            while (students[rightMarker].mark < pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {
                    Student tmp = students[leftMarker];
                    students[leftMarker] = students[rightMarker];
                    students[rightMarker] = tmp;
                }

                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(students, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(students, leftBorder, rightMarker);
        }
    }

}
