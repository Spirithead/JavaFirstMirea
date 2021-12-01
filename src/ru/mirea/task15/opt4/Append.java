package ru.mirea.task15.opt4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Append {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        File output=new File("C:\\Users\\huawei\\Desktop","out.txt");
        FileWriter writer=new FileWriter(output,true);
        System.out.println("строка:");
        String txt=sc.next();
        writer.write(txt);
        writer.flush();
    }
}
