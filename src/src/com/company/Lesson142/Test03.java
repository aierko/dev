package com.company.Lesson142;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by User on 04.01.2018.
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("c:/New box/1.txt");
        FileWriter writer = new FileWriter("c:/New box/2.txt");
        char max = 0;
        while (reader.ready()) {
            char data = (char) reader.read();
            if(data > max)
                max = data;
            writer.write(data);
        }
        System.out.println(max);

        reader.close();
        writer.close();
    }

}
