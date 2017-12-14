package com.company.Lesson138.Task01;

/**
 * Created by User on 03.12.2017.
 */
public class MarkTwainBook extends Book {
    String name = null;
    public MarkTwainBook(String name) {
        super("MarkTwain");
       this.name = name;
    }

    @Override
    public MarkTwainBook getBook() {
        return this;
    }

    @Override
    public String getName() {
        return name;
    }
}
