package me.nilpoint.gof.observer.assignment;

/**
 *
 * Created by john on 2016/2/8 0008.
 */
public class Observer1 implements IObserver {
  @Override
  public void update(String name, int value) {
    System.out.println("Observer1: The value is " + value + " changed by " + name);
  }
}
