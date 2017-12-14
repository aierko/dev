package com.company.OOPHomeWork.Task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 12.12.2017. Закрепляем Solution pattern
 * <p>
 * 1. Найти в гугле пример для - Solution pattern Lazy initialization.
 * 2. По образу и подобию в отдельных файлах создать три синглтон класса Sun, Moon, Earth.
 * 3. Реализовать интерфейс Planet для классов Sun, Moon, Earth.
 * 4. В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet.
 * 5. Реализовать функционал метода readKeyFromConsoleAndInitPlanet:
 * 5.1. С консоли считать один параметр типа String.
 * 5.2. Если параметр равен одной из констант интерфейса Planet, то создать соответствующий объект и присвоить его Planet thePlanet,
 * иначе обнулить Planet thePlanet.
 * 5.3. Сравнивать введенный параметр можно только с константами из Planet, нельзя создавать свои строки.
 */
public class Solution {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
      readKeyFromConsoleAndInitPlanet();
        System.out.println(ThePlanet.getClass().getSimpleName());
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        String line = reader.readLine();
        if (line.equals(Planet.earth)) {
            ThePlanet = Earth.getEarth();
        } else if (line.equals(Planet.moon)) {
            ThePlanet = Moon.getMoon();
        } else if (line.equals(Planet.sun)) {
            ThePlanet = Sun.getSun();
        } else ThePlanet = null;
    }

    static Planet ThePlanet;

}
