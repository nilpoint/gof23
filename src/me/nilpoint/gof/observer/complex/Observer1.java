package me.nilpoint.gof.observer.complex;

/**
 *
 * Created by john on 2016/2/8 0008.
 */
public class Observer1 implements IObserver {
  @Override
  public void update(int i) {
    System.out.println("Observer1: myValue in Subject is now: " + i);
  }
}
