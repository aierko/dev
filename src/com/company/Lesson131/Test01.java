package com.company.Lesson131;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 03.11.2017.
 * /*
 * 1. Создать классы Person, RepkaStory и интерфейс RepkaItem
 * 2. В интерфейсе RepkaItem создать метод String getNamePadezh();
 * 3. Реализовать интерфейс RepkaItem в классе Person.
 * 5. В классе Person создать переменные  String name, String namePadezh;
 * 6. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'. Пример:
 * Бабка за Дедку
 * Дедка за Репку
 * 7. Создать метод tell в классе RepkaStory.
 * 8. С помощью цикла реализовать метод tell, который должен выполнять логику вывода на экран с помощью метода pull(Person person)
 * 9. Выполнить метод main
 * List<Person> plot = new ArrayList<Person>();
 * plot.add(new Person("Репка", "Репку"));
 * plot.add(new Person("Дедка", "Дедку"));
 * plot.add(new Person("Бабка", "Бабку"));
 * plot.add(new Person("Внучка", "Внучку"));
 * RepkaStory.tell(plot);
 */
public class Test01 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }

}

class Person implements RepkaItem {

    private String name;
    private String namePadeg;

    Person(String name, String namePadeg) {
        this.name = name;
        this.namePadeg = namePadeg;
    }

    @Override
    public String getNamePadezh() {
        return namePadeg;
    }

    public  void pull(Person person) {
        System.out.println(String.format("%s за %s", name, person.getNamePadezh()));
    }
}

class RepkaStory {
     public static void tell(List<Person> plot){
         for (int i = plot.size()-1 ; i > 0 ; i--) {
             plot.get(i).pull(plot.get(i-1));
         }
     }
}

interface RepkaItem {
    public abstract String getNamePadezh();
}