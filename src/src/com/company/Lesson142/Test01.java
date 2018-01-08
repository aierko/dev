package com.company.Lesson142;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by User on 04.01.2018.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/New box/1.txt");
        FileOutputStream outputStream = new FileOutputStream("c:/New box/2.txt");

        while (inputStream.available()>0) {
            int data = inputStream.read();
            outputStream.write(data);
        }

        inputStream.close();
        outputStream.close();
    }
}
