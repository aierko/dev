package com.company.Lesson138.Task02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 03.12.2017.
 */
public class ContainsMain {
    public static void main(String[] args) {
        printlnBodyParts();
        printlnFingers();
    }
  public static void printlnBodyParts(){
      List<BodyPart> parts = new ArrayList<>();
      parts.add(new BodyPart("Head"));
      parts.add(new BodyPart("Hand left"));
      parts.add(new BodyPart("Hand right"));
      System.out.println(parts);
  }
    public static void printlnFingers(){
       List<Finger> fingers = new ArrayList<>();
       fingers.add(new Finger("First",true));
       fingers.add(new Finger("Second",true));
       fingers.add(new Finger("Third",false));
       fingers.add(new Finger("Four",false));
       fingers.add(new Finger("Fifth",false));
        System.out.println(fingers);
    }
}
