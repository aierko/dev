package com.company.Lesson105;

import java.io.*;

/**
 * Created by User on 28.07.2017.
 */
/*
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еnще раз прочитать имя файла с консоли,
 а уже потом считывать файл для записи.
*/
public class FileTest2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream;

        while (true) {
            try {
                String file1 = reader.readLine();
                inputStream = new FileInputStream(file1);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("incorrect file path, please try again letter");
            }
        }

        String file2 = reader.readLine();
        FileOutputStream outputStream = new FileOutputStream(file2);

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data);
        }
    }
}
