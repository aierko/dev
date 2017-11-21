package com.company.Lesson134.Task03;

/**
 * Created by User on 17.11.2017.
 * Написать Фабрику(Factory) по производству кур(Hen)
 * 1. Создать класс Hen
 * 1.1. Сделать его абстрактным
 * 1.2. Добавить в класс абстрактный метод int getCountOfEggsPerMonth()
 * 1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."
 * <p>
 * 2. Создать класс RussianHen, который наследуется от Hen
 * 3. Создать класс UkrainianHen, который наследуется от Hen
 * 4. Создать класс MoldovanHen, который наследуется от Hen
 * 5. Создать класс BelarussianHen, который наследуется от Hen
 * <p>
 * 6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
 * Методы должны возвращать количество яиц в месяц от данного типа куриц.
 * <p>
 * 7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
 * Методы должны возвращать строку вида:
 * <getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">;
 * где Sssss - название страны
 * где N - количество яиц в месяц
 * <p>
 * 8. В классе HenFactory реализовать метод getHen, который возвращает соответствующую стране породу кур
 * 9. Все созданные вами классы должны быть в отдельных файлах
 */
public class Test01 {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.belarussia);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
        Hen hen1 = HenFactory.getHen(Country.moldova);
        hen1.getCountOfEggsPerMonth();
        System.out.println(hen1.getDescription());
        Hen hen2 = HenFactory.getHen(Country.ukrain);
        hen2.getCountOfEggsPerMonth();
        System.out.println(hen2.getDescription());
        Hen hen3 = HenFactory.getHen(Country.russia);
        hen3.getCountOfEggsPerMonth();
        System.out.println(hen3.getDescription());
    }
}
