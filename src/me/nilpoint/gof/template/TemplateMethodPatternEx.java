package me.nilpoint.gof.template;

/**
 *
 * Created by john on 2016/2/9 0009.
 */
public class TemplateMethodPatternEx {
  public static void main(String[] args) {
    System.out.println("***Template Method Pattern Demo***\n");

    BasicEngineering bs = new ComputerScience();
    System.out.println("Computer Sc Papers:");
    bs.Papers();
    System.out.println();
    bs = new Electronics();
    System.out.println("Electronics Papers:");
    bs.Papers();
  }
}
