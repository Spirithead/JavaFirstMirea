package ru.mirea.task14.opt1;

import ru.mirea.task14.Card;

import java.util.Scanner;
import java.util.Stack;

public class StackGame {
    public static void main(String[] args) {
        Card firstPop;
        Card secondPop;
        int step=0;
        Stack<Card> first=new Stack<>();
        Stack<Card> second=new Stack<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            first.push(new Card(sc.nextInt()));
        }
        for(int i=0;i<3;i++){
            Card temp = first.elementAt(i);
            first.set(i, first.elementAt(first.size()-1-i));
            first.set(first.size()-1-i,temp);
        }
        for(int i=0;i<5;i++){
            second.push(new Card(sc.nextInt()));
        }
        for(int i=0;i<3;i++){
            Card temp = second.elementAt(i);
            second.set(i, second.elementAt(second.size()-1-i));
            second.set(second.size()-1-i,temp);
        }

        while (!first.empty()&&!second.empty()){
            if(step==106){
                System.out.print("botva");
                System.exit(0);
            }
            step++;
            firstPop=first.pop();
            secondPop=second.pop();

            if(comparing(firstPop,secondPop)){
                addCardsToStack(firstPop, secondPop, first);
            }

            else{
                addCardsToStack(firstPop, secondPop, second);
            }
        }
        if(first.empty())System.out.print("second ");
        else System.out.print("first ");
        System.out.print(step);


    }

    private static void addCardsToStack(Card firstCard, Card secondCard, Stack<Card> wonPlayer) {
        Stack<Card> buffer;
        buffer=(Stack<Card>) wonPlayer.clone();
        wonPlayer.clear();
        wonPlayer.push(secondCard);
        wonPlayer.push(firstCard);
        for(int i=0;i< buffer.size();i++){
            wonPlayer.push(buffer.elementAt(i));
        }
    }

    private static boolean comparing(Card first, Card second){//сравнивает, больше ли значение первой карты значения второй
        if(first.getNumber()==0&&second.getNumber()==9)return true;
        else if(second.getNumber()==0&&first.getNumber()==9)return false;
        else if(first.getNumber()>second.getNumber()) return true;
        else return false;
    }

}
