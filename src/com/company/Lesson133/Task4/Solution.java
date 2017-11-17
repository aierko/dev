package com.company.Lesson133.Task4;

/**
 * Created by User on 14.11.2017.
 * 1. Создай класс Food с методом eat который должен писать в консоль "food is eaten".
 2.Создай интерфейс Selectable с методом onSelect.
 2. Реализовать интерфейс Selectable в классе Food.
 3. Метод onSelect() должен писать в консоль "food is selected".
 4. Подумай, какие методы можно вызвать для переменной food и какие для selectable.
 5. В методе foodMethods вызови методы onSelect, eat, если это возможно.
 6. В методе selectableMethods вызови методы onSelect, eat, если это возможно.
 7. Явное приведение типов не использовать.

 */
public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        foodMethods(food);
        selectableMethods(selectable);
        Food newfood = (Food) selectable;
        foodMethods(newfood);
        if ( food instanceof Selectable && food instanceof Food){
            System.out.println(true);
        }
    }

    public static void foodMethods(Food food){
        food.onSelect();
        food.eat();
    }
    public static void selectableMethods(Selectable selectable){
        selectable.onSelect();

    }
}
