package me.nilpoint.gof.adapter.area;

/**
 * Calculate the area of a Triangle using CalculatorAdapter.
 * Please note here: this time our input is a Triangle.
 *
 * Created by john on 2016/2/10 0010.
 */
public class CalculatorAdapter {
  Calculator calculator;
  Triangle triangle;

  public double getArea(Triangle t) {
    calculator = new Calculator();
    triangle = t;
    Rect rect = new Rect();

    //Area of Triangle=0.5*base*height
    rect.l = triangle.b;
    rect.w = 0.5 * triangle.h;

    return calculator.getArea(rect);
  }
}
