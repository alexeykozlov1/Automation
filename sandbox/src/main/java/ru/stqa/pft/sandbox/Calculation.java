package ru.stqa.pft.sandbox;

/**
 * Created by alexeykozlov on 10/12/17.
 */
public class Calculation {

  public static void main(String[] args) {

    Point p = new Point(2, 3);


    System.out.println("Total distance between " + p.p1 + " and " + p.p2 + " is " + p.distance());
  }


}
