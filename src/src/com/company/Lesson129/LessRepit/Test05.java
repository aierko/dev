package com.company.Lesson129.LessRepit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 25.10.2017./*
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
 */
public class Test05 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка","Внучку"));
        plot.add(new Person("Жучка", "Жучку"));
        RepkaStory.tell(plot);
    }
}
interface RepkaItem{
    String getNamePadezh();
}
class Person implements RepkaItem{
    String name;
    String namePadezh;

    public Person(String name, String namePadezh) {
          this.name = name;
          this.namePadezh = namePadezh;
    }

    public void pull(Person person){
        System.out.println (String.format("%s за %s", this.name, person.namePadezh));
    }
    @Override
    public String getNamePadezh() {
        return namePadezh;
    }

}
class RepkaStory{
    public static void tell(List<Person> plot){
        for (int i = plot.size()-1; i > 0; i--){ // i = 3
            Person person1 = plot.get(i);   // Vnuchka Vnuchku
            Person person2 = plot.get(i-1); // Babka Babku
            person1.pull(person2);
        }
    }
}

