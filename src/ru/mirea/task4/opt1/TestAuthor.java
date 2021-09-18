package ru.mirea.task4.opt1;

public class TestAuthor {
    public static void main(String args[]){
        Author author = new Author("Lev Tolstoy","lev_tolstoy@mail.ru",'m');
        System.out.println(author.toString());
        System.out.println(author.getName());
        System.out.println(author.getGender());
        author.setEmail("tolstoy_lev@mail.ru");
        System.out.println(author.getEmail());
    }
}
