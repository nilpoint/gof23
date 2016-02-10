package me.nilpoint.gof.adapter.area;

/**
 *
 * Created by john on 2016/2/10 0010.
 */
public class Calculator {
  Rect rectangle;
  public double getArea(Rect r) {
    rectangle = r;
    return rectangle.l * rectangle.w;
  }
}
