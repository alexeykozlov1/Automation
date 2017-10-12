package ru.stqa.pft.sandbox;

/**
 * Created by alexeykozlov on 10/12/17.
 */


public class Point {


  public double p1 = 0.0;
  public double p2 = 0.0;

  public double distance() {
    double c = p1 * p2;
    return c;
  }

  public Point(double p1, double p2) {

    this.p1 = p1;
    this.p2 = p2;
  }

}


