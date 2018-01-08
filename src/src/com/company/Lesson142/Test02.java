package com.company.Lesson142;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by User on 04.01.2018.
 */
public class Test02 {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("c:/New box/1.txt");
        int max = 0;
        ArrayList<Byte> arrayList = new ArrayList<>();
        while (inputStream.available() > 0){
            byte data = (byte) inputStream.read();
            arrayList.add(data);
        }
        System.out.println(arrayList);
        FileInputStream inputStream1 = new FileInputStream("c:/New box/1.txt");
        while (inputStream1.available() > 0) {
            int data = inputStream1.read();
            if (data > max) {
                max = data;
            }
        }
        System.out.println(max);
    }
}

