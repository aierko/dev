package com.company.Lesson105;

import java.io.*;

/**
 * Created by User on 28.07.2017.
 */
/*
Задача: Пользователь вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/
public class FilesTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream = new FileOutputStream(fileName2);

        while(inputStream.available() > 0){
            int data = inputStream.read();
            outputStream.write(data);
        }
    }
}
