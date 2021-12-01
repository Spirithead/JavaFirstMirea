package ru.mirea.task15.opt2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(String[] args) throws IOException {
        File input=new File("C:\\Users\\huawei\\Desktop","out.txt");
        FileReader reader=new FileReader(input);
        char[] buffer = new char[64];
        int a=0;
        while((a=reader.read(buffer))!=-1){
            if(a<64) System.arraycopy(buffer,0,buffer,0,a);
        }
        String out=String.valueOf(buffer);
        System.out.print(out);
    }
}
