package com.company.Lesson107;

import java.io.*;

/**
 * Created by User on 08.08.2017.
 * Задача: Пользователь вводит два имени файла. И копирует первый файл на место заданное вторым именем.
 */
public class Test05 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
          String file1 = reader.readLine();
          String file2 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        while (fileInputStream.available() > 0){
            fileOutputStream.write(fileInputStream.read());
        }
    }

}
