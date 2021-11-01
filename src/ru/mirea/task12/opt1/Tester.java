package ru.mirea.task12.opt1;

public class Tester {
    public static void main(String[] args) {
        Student[] students=new Student[5];
        for(int i=0;i<5;i++) students[i]=new Student();
        int[] numbers=new int[5];
        for (int i=0;i<5;i++){
            numbers[i]=students[i].iDNumber;
        }
        for(int i=0;i<5;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("----------------");
        sort(numbers);

        for(int i=0;i<5;i++){
            System.out.println(numbers[i]);
        }
    }

    static int[] sort(int[] arr){
        for(int curr=0;curr< arr.length;curr++){
            int value = arr[curr];
            int i=curr-1;
            for(;i>=0;i--){
                if (value<arr[i]){
                    arr[i+1]=arr[i];
                }
                else break;
            }
            arr[i+1]=value;
        }
        return arr;
    }
}
