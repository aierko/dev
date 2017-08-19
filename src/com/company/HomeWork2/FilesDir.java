package com.company.HomeWork2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 11.08.2017.
 */
public class FilesDir {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dirName = reader.readLine();
        File dir = new File(dirName);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (!file.isDirectory()){
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}
