package com.company.Lesson134.Task02;

/**
 * Created by User on 17.11.2017.
 * Создай цепочку классов Mouse, GreyMouse, Jerry
 * Реализуй метод void printClasses(Object obj, Mouse mouse, GreyMouse greyMouse, Jerry jerry)
 * Инициализируй все обьекты и передай в метод.
 */
public class Test02 {
    public static void main(String[] args) {
//        Object object = new Object();
//        Mouse mouse = new Mouse();
//        GreyMouse greyMouse = new GreyMouse();
//        Jerry jerry = new Jerry();
//        printClasses(object, mouse, greyMouse, jerry);
        Object obj = new Jerry();
        Mouse mouse = (Mouse) obj;
        GreyMouse greyMouse = (GreyMouse) mouse;
        Jerry jerry = (Jerry) greyMouse;
        printClasses(obj, mouse, greyMouse, jerry);
    }
    public static void printClasses(Object obj, Mouse mouse, GreyMouse greyMouse, Jerry jerry){
        System.out.println(obj.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(greyMouse.getClass().getSimpleName());
        System.out.println(jerry.getClass().getSimpleName());
    }


}
