package com.company.Lesson136.Task01;

/**
 * Created by User on 24.11.2017.
 * 1. Напиши реализацию метода printMainInfo, чтобы:
 1.1. Если в метод передают объект типа Drawable, у этого объекта вызывался метод draw.
 1.2. Если в метод передают объект типа Movable, у этого объекта вызывался метод move.
 */
public class Test01 {
    public static void main(String[] args) {
         Object circle = new Circle();
         Object rectangle = new Rectangle();
         Movable move = (Movable) circle;
         Drawable draw = (Drawable) rectangle;
         prinMainInfo(move);
         prinMainInfo(draw);
    }
   static void prinMainInfo(Object object){
        if (object instanceof Drawable){
           ((Drawable) object).draw();
        }
        if (object instanceof Movable){
            ((Movable) object).move();
        }
    }
}
interface Movable{
    void move();
}
interface Drawable{
    void draw();
}
class Circle implements Movable{

    @Override
    public void move() {
        System.out.println("I can move");
    }
}
class Rectangle implements Drawable{

    @Override
    public void draw(){
        System.out.println("I can draw");
    }
}
