package com.company.Lesson05;

/**
 * Created by user on 13.09.2016.
 *//* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/
public class Test04 {
    public static void main(String[] args) {
        for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j <10; j++){
                System.out.print("8");
            }
            System.out.println();
            for (int k = 0; k<10; k++){
                System.out.println("8");
            }
        }
    }
}
