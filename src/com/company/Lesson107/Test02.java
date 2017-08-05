package com.company.Lesson107;

import java.io.*;

/**
 *  Задача: Пользователь вводит два имени файла. И копирует первый файл на место заданное вторым именем.
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String file1 = reader.readLine();
       String file2 = reader.readLine();
        FileOutputStream outputStream = new FileOutputStream(file2);
        FileInputStream inputStream = new FileInputStream(file1);
        while (inputStream.available() > 0){
            outputStream.write(inputStream.read());
        }

    }

}
