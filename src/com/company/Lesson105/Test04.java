package com.company.Lesson105;

import java.io.*;

/**
 * Created by User on 28.07.2017.
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filname1 = reader.readLine();
        String filname2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(filname1);
        FileOutputStream outputStream = new FileOutputStream(filname2);

        while (inputStream.available() > 0){
            int data = inputStream.read();
            outputStream.write(data);
        }

    }
}
