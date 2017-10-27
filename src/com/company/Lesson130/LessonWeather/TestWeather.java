package com.company.Lesson130.LessonWeather;

/**
 * Created by User on 27.10.2017.
 * /* Погода
 1. Создать интерфейс Weather с методом getWeatherType().
 2. Создать интерфейс WeatherType с перечнем погодных условий.
 3. В классе Today реализовать интерфейс Weather.
 4. В классе Today создать переменную String type;
 5. Подумай, как связан параметр String type с методом getWeatherType().
 6. Переопределить метод toString() в классе Today, что бы он выводил на экран надпись %s for today, где %s - тип погоды
 */
public class TestWeather {
    public static void main(String[] args) {
        Today today = new Today(WeatherType.RAIN);
        System.out.println(today);
    }

}
interface Weather{
     String getWeatherType();
}
interface WeatherType{
   public static final String WIND = "Windly";
   public static final String HOT = "Hotly";
   public static final String FROZEN = "Frozen";
   public static final String RAIN = "Rainly";
}
class Today implements Weather {
    String type;
    Today(String type){
        this.type = type;
    }

    @Override
    public String getWeatherType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%s for today", type);
    }
}

