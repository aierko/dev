package com.company.Lesson106;

import java.io.*;

/**
 * Created by User on 30.07.2017.
 * Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
 * Если файла (который нужно копировать) с указанным именем не существует, то
 * программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли,
 * а уже потом считывать файл для записи.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream streamFile1 = null; // создаем и инициализируем поток чтения из файла.
        while (true) {     // в цикле перехватываем ошибку,
            try {          // с  возможным отсутствием адресса потока
                String file1 = reader.readLine();  // адресс файла
                streamFile1 = new FileInputStream(file1);  // если ввели нормально!?, то ->
                break;                                      // обрыв и переход поток 2 для ввода адресса к 2 му файлу->
            } catch (FileNotFoundException e) {   //// не правильный ввод и переход к циклу наверх для повторения,
                System.out.println("введите еще раз");// пока не введем правильно!!!!!
            }
        }
        String file2 = reader.readLine();   // адресс файла
        FileOutputStream streamFile2 = new FileOutputStream(file2); //создание и инициализация потока записи в файл.
        while (streamFile1.available() > 0) { // проверка к-ва допустимых байт
            streamFile2.write(streamFile1.read()); // чтение текста из 1-го файла и запись текста во 2ой файл . заверкшение программы.
        }
    }
}
