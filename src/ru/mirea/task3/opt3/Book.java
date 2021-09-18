package ru.mirea.task3.opt3;

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

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getAge() {
        return age;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
