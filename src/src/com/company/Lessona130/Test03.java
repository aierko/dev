package com.company.Lessona130;

/**
 * Created by User on 30.10.2017./*
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
public class Test03 {
    public static void main(String[] args) {
        GermanyTranslator germanyTranslator = new GermanyTranslator();
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
        System.out.println(germanyTranslator.translate());
    }
}
class EnglishTranslator extends Translater{

    @Override
    String getLanguage() {
        return "English";
    }
}
abstract class Translater{
    abstract String getLanguage();
    public String translate(){

        return ("Я переводчик с " + getLanguage());
    }
}
class GermanyTranslator extends Translater{

    @Override
    String getLanguage() {
        return "Germany";
    }
}

