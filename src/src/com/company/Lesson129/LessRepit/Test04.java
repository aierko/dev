package com.company.Lesson129.LessRepit;

/**
 * Created by User on 25.10.2017.
 * /* Погода
 * 1. Создать интерфейс Weather с методом getWeatherType().
 * 2. Создать интерфейс WeatherType с перечнем погодных условий.
 * 3. В классе Today реализовать интерфейс Weather.
 * 4. В классе Today создать переменную String type;
 * 5. Подумай, как связан параметр String type с методом getWeatherType().
 * 6. Переопределить метод toString() в классе Today, что бы он выводил на экран надпись %s for today,
 * где %s - тип погоды
 */
public class Test04 {
    public static void main(String[] args) {
        Today today = new Today(WeatherType.RAINY);
        System.out.println(today);
    }


}

interface Weather {
    String getWeatherType();
}

interface WeatherType {
    public final static String RAINY = "Rain";
    public final static String FROZEN = "Frozen";
    public final static String HOTLY = "Hotly";
    public final static String WINDLY = "Windly";
}

class Today implements Weather {
    private String type;

    Today(String type) {
        this.type = type;
    }

    @Override
    public String getWeatherType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%s for today", getWeatherType());
    }
}
