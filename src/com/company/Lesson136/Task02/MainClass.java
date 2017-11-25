package com.company.Lesson136.Task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 24.11.2017.
 */
public class MainClass {
    static  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while (true){
            String key = reader.readLine();
            if (key.equals("Cartoon")|| key.equals("Thriller")|| key.equals("SoapOpera")){
                Movie movie = MovieFactory.getMovie(key);
                System.out.println(movie.getClass().getSimpleName());
            }
            else break;

        }
    }

}
