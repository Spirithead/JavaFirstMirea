package ru.mirea.task14.opt3;

import ru.mirea.task14.Card;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DequeGame {
    public static void main(String[] args) {
        ArrayDeque<Card> first=new ArrayDeque<>();
        ArrayDeque<Card> second=new ArrayDeque<>();
        Card firstPoll;
        Card secondPoll;
        int step=0;
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<5;i++){
            first.add(new Card(sc.nextInt()));
        }
        for(int i=0;i<5;i++){
            second.add(new Card(sc.nextInt()));
        }

        while(!first.isEmpty()&&!second.isEmpty()){
            if(step==106){
                System.out.print("botva");
                System.exit(0);
            }
            step++;
            firstPoll=first.remove();
            secondPoll=second.remove();

            if(comparing(firstPoll,secondPoll)){
                first.add(firstPoll);
                first.add(secondPoll);
            }
            else{
                second.add(firstPoll);
                second.add(secondPoll);
            }
        }
        if(first.isEmpty())System.out.print("second ");
        else System.out.print("first ");
        System.out.print(step);
    }

    private static boolean comparing(Card first, Card second){//сравнивает, больше ли значение первой карты значения второй
        if(first.getNumber()==0&&second.getNumber()==9)return true;
        else if(second.getNumber()==0&&first.getNumber()==9)return false;
        else if(first.getNumber()>second.getNumber()) return true;
        else return false;
    }
}
