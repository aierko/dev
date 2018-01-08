package com.company.Lesson108;

import java.io.*;

/**
 * Created by User on 11.08.2017.
 * Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
 * Если файла (который нужно копировать) с указанным именем не существует, то
 * программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли,
 * а уже потом считывать файл для записи.
 */
public class Test03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
               vvod();
    }

    public static void vvod() throws IOException {
        FileInputStream inputStream = null;
        while (true) {
            try {
                String file1 = reader.readLine();
                inputStream = new FileInputStream(file1);
                break;
            } catch (FileNotFoundException e) {
                System.out.println(" введите еще раз ");
            }

        }
        String file2 = reader.readLine();
        FileOutputStream outputStream = new FileOutputStream(file2);
         while (inputStream.available()> 0){
             outputStream.write(inputStream.read());
         }
    }
}
