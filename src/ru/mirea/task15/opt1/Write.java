package ru.mirea.task15.opt1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("введите название файла:");
        String name = sc.next();
        File output=new File("C:\\Users\\huawei\\Desktop",name+".txt");
        output.createNewFile();
        FileWriter writer=new FileWriter(output,true);
        System.out.println("строка:");
        String txt=sc.next();
        writer.write(txt);
        writer.flush();
    }
}
