package me.nilpoint.gof.strategy.choices;

/**
 *
 * Created by john on 2016/2/10 0010.
 */
public class FirstChoice implements IChoice {
  @Override
  public void myChoice(String s1, String s2) {
    System.out.println("You want to add the two numbers.");
    int num1, num2, sum;
    num1 = Integer.parseInt(s1);
    num2 = Integer.parseInt(s2);
    sum = num1 + num2;
    System.out.println(" The result of the addition is " + sum);
    System.out.print("***End of the strategy***");
  }
}
