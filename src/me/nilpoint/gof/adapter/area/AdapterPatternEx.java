package me.nilpoint.gof.adapter.area;

/**
 *
 * Created by john on 2016/2/10 0010.
 */
public class AdapterPatternEx {
  public static void main(String[] args) {
    System.out.println("***Adapter Pattern Demo***");

    CalculatorAdapter cal=new CalculatorAdapter();
    Triangle t = new Triangle(20,10);

    System.out.println("\nAdapter Pattern Example\n");
    System.out.println("Area of Triangle is :" + cal.getArea(t));
  }
}
