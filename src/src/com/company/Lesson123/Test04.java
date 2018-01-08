
/**
 * Created by User on 08.10.2017.
 * /* Или «Кошка», или «Собака», или «Птица», или «Лампа»
 Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
 */

public class Test04 {
    public static void main(String[] args) {
        method(new Kitten());
        method(new Bird());
        method(new Fish());
        method(new Lamp());
    }

    public static void method(Object obj) {
        if(obj instanceof Kitten){
            System.out.println("Kitten");
        } else if(obj instanceof Fish){
            System.out.println("Fish");
        } else if(obj instanceof Bird){
            System.out.println("Bird");
        } else if(obj instanceof Lamp){
            System.out.println("Lamp");
        }
    }
}

class Fish{}
class Lamp{}
class Bird{}
class Kitten{}
