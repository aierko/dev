package com.company.Lesson138.Task01;

/**
 * Created by User on 03.12.2017.
 * 1. Создай абстрактній класс Book.
 * 2. В классе Book есть переменная author, напиши конструктор и абстрактные методы getBook и getName.
 * 3. Создайте public класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain]. Параметр конструктора - имя книги.
 * 4. В классе MarkTwainBook реализуйте все абстрактные методы.
 * 5. Для метода getBook расширьте тип возвращаемого результата.
 * 6. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
 * 7. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
 * 7.1. String agathaChristieOutput для книг Агаты Кристи;
 * 7.2. String markTwainOutput для книг Марка Твена.
 * 8. В классе Book метод toString должен возвращать getOutputByBookType.
 */
public abstract class Book {
    String author = null;

    public Book(String author) {
        this.author = author;
    }

    public abstract Book getBook();

    public abstract String getName();

    public String getOutputByBookType() {
        String agathaChristieOutput = author + " = " + getBook().getName();
        String markTwaineOutput = author + " = " + getBook().getName();
        if (this instanceof MarkTwainBook) {
            return markTwaineOutput;
        } else if (this instanceof AgathaChristieBook) {
            return agathaChristieOutput;
        }
        return author;
    }

    @Override
    public String toString() {
        return getOutputByBookType();
    }
}
