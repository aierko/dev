package com.company.Lesson108;

import java.io.*;

/**
 * Created by User on 11.08.2017.Задача:
 * Пользователь вводит два имени файла. И копирует первый файл на место заданное вторым именем.
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        while (fileInputStream.available() > 0){
            fileOutputStream.write(fileInputStream.read());
        }
    }
}

