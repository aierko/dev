package com.company.Lesson131;

/**
 * Created by User on 03.11.2017.
 * /*
 1. Создать класс EnglishTranslator, который наследуется от абстрактного класса Translator.
 В классе Translator создать абстрактный метод getLanguage() и не абстрактный метод
 public String translate(), который возвращает строку "Я переводчик с " + getLanguage();
 2. Реализовать все абстрактные методы.
 3. Подумай, что должен возвращать метод getLanguage.
 4. Программа должна выводить на экран "Я переводчик с английского".
 5. Создать класс GermanyTranslator, который наследуется от абстрактного класса Translator.
 6. Реализовать все абстрактные методы.
 7. Подумай, что должен возвращать метод getLanguage.
 8. Программа должна выводить на экран "Я переводчик с немецкого".
 */
public class Test02 {
    public static void main(String[] args) {
        EnglishTranslator translator = new EnglishTranslator();
        GermanyTranslator translator1 = new GermanyTranslator();
        System.out.println(translator.translate());
        System.out.println(translator1.translate());
    }
}
class EnglishTranslator extends Translator{
    @Override
    public String getLanguage() {
        return  "английского";
    }
}
abstract class Translator{
    public abstract String getLanguage();

    public String translate() {
        return "Я переводчик с " +  getLanguage();
    }
}
class GermanyTranslator extends Translator{

    @Override
    public String getLanguage() {
        return "немецкого";
    }
}