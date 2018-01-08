package com.company.Lesson106;

import java.io.*;

/**
 * Created by User on 31.07.2017.
 * Задача: Пользователь вводит два имени файла. И копирует первый файл на место заданное вторым именем.
 */
public class Test03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        while (inputStream.available() > 0) {
            outputStream.write(inputStream.read());
        }
    }
}
