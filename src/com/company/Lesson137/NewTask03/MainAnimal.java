package com.company.Lesson137.NewTask03;

/**
 * Created by User on 28.11.2017.
 *  Создать класс  SmallAnimal напиши метод default String getSize().
 Создать класс  BigAnimal напиши метод protected String getSize().
 Создать класс Goose(Гусь).
 2. Создать класс Dragon(Дракон).
 3. Унаследовать класс Goose от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
 4. Унаследовать класс Dragon от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
 5. В классах Goose и Dragon переопределить метод String getSize(), расширить видимость до максимальной.
 6. В классе Goose метод getSize должен возвращать строку "Гусь маленький, " + [getSize родительского класса].
 7. В классе Dragon метод getSize должен возвращать строку "Дракон большой, " + [getSizeродительского класса].

 *
 */
public class MainAnimal {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        Goose goose = new Goose();
        System.out.println(dragon.getSize());
        System.out.println(goose.getSize());
    }
}
