package ru.mirea.task3.opt3;

public class BookTest {
    public static void main(String args[]){
        Book book = new Book("Anna Karenina","Lev Tolstoy",1878);
        System.out.println(book.toString());
        book.setTitle("Revizor");
        book.setAuthor("Gogol");
        book.setAge(1851);
        System.out.println(book.toString());
    }
}
