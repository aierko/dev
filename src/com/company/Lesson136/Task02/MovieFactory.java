package com.company.Lesson136.Task02;

/**
 * Created by User on 24.11.2017.
 */
public class MovieFactory {
    static Movie getMovie(String key){
        Movie movie = null;
        if("SoapOpera".equals(key)) {
            movie = new SoapOpera();
        }
        else if ("Cartoon".equals(key)){
            movie = new Cartoon();
        }
        else if ("Thriller".equals(key)){
            movie = new Thriller();
        }
        return movie;
    }
}
