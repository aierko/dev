package com.company.Lesson16;

/**
 * Created by user on 21.10.2016.
 */
public class ClassJavaRush {
        public static void main(String[] args)
        {
            int x = 1;
            int y = 0;

            y = y + x; //y = 1

            x = x * 2; //x = 2
            y = y + x; //y = 3 - 2

            x = x * 2; //x = 4 - 1
            //y = y + x; //y = 7

            x = x * 2; //x = 8
            //y = y + x;// y = 15 - 1

            x = x * 2;//x = 16 - 2
            y = y + x; //31 -> 19

            System.out.println(y);
        }
}
