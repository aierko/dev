package com.company.Lesson130.LessonWeather;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 27.10.2017.
 * /*
 1. Создать классы Person, RepkaStory и интерфейс RepkaItem
 2. В интерфейсе RepkaItem создать метод String getNamePadezh();
 3. Реализовать интерфейс RepkaItem в классе Person.
 5. В классе Person создать переменные  String name, String namePadezh;
 6. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'. Пример:
 Бабка за Дедку
 Дедка за Репку
 7. Создать метод tell в классе RepkaStory.
 8. С помощью цикла реализовать метод tell, который должен выполнять логику вывода на экран с помощью метода pull(Person person)
 9. Выполнить метод main
 List<Person> plot = new ArrayList<Person>();
 plot.add(new Person("Репка", "Репку"));
 plot.add(new Person("Дедка", "Дедку"));
 plot.add(new Person("Бабка", "Бабку"));
 plot.add(new Person("Внучка", "Внучку"));
 RepkaStory.tell(plot);
 *
 */
public class Test03 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}
class Person implements RepkaItem{
    String name;
    String namePadegh;
    Person(String name, String namePadegh){
        this.name = name;
        this.namePadegh = namePadegh;
    }
    public void pull(Person person){
        System.out.println (String.format(" %s за %s ", this.name, person.namePadegh ));
    }
}
class RepkaStory{
    public static void tell(List<Person> plot){
        for (int i = plot.size()-1; i > 0; i--) {
            plot.get(i).pull(plot.get(i-1));
        }
    }
}
interface RepkaItem{}

