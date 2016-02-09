package me.nilpoint.gof.singleton.complex;

/**
 *
 * Created by john on 2016/2/9 0009.
 */
public class MakeACaptain {

  static {
    System.out.println("MakeACaptain static block is called.");
  }

  private MakeACaptain() {
    System.out.println("MakeACaptain private constructor is called.");
  }

  // Bill Pugh solution
  private static class SingletonHelper {
    // Nested class is referenced after getCaptain() is called
    private static MakeACaptain _captain = new MakeACaptain();
  }

  public static MakeACaptain getCaptain() {
    return SingletonHelper._captain;
  }
}
