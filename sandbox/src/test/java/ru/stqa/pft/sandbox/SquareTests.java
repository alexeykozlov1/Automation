package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by alexeykozlov on 10/12/17.
 */
public class SquareTests {

  @Test
  public void testArea() {

    Point p = new Point(5, 6);
    Assert.assertEquals(p.distance(), 30.0);

  }
}
