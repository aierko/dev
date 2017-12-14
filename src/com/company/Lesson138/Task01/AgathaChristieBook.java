package com.company.Lesson138.Task01;

/**
 * Created by User on 03.12.2017.
 */
public class AgathaChristieBook extends Book {
    String name = null;
    public AgathaChristieBook(String name) {
        super("Agatha Christie");
        this.name = name;
    }

    @Override
    public AgathaChristieBook getBook() {
        return this;
    }

    @Override
    public String getName() {
        return name;
    }
}
