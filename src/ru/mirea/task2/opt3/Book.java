package ru.mirea.task2.opt3;

public class Book {
    String title;
    String author;
    int age;
    public Book(String title, String author, int age){
        this.title=title;
        this.author=author;
        this.age=age;
    }
    public String toString(){
        return "title: "+title+", author: "+author+", age: "+age;
    }
}
