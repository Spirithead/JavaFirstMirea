package ru.mirea.task15.opt3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Rewrite {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        File output=new File("C:\\Users\\huawei\\Desktop","ezh.txt");
        FileWriter writer=new FileWriter(output,false);
        System.out.println("строка:");
        String txt=sc.next();
        writer.write(txt);
        writer.flush();
    }
}
