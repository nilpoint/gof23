package me.nilpoint.gof.singleton.complex;

/**
 *
 * Created by john on 2016/2/9 0009.
 */
public class SingletonPatternThreadSafetyEx {
  public static void main(String[] args) {
    System.out.println("***Singleton Pattern Demo***\n");
    System.out.println("Trying to make a captain for our team");

    System.out.println("Prepare to create the first instance.");
    MakeACaptain c1 = MakeACaptain.getCaptain();

    System.out.println("Trying to make another captain for our team");
    MakeACaptain c2 = MakeACaptain.getCaptain();

    if (c1 == c2)
    {
      System.out.println("c1 and c2 are same instance");
    }
  }
}
