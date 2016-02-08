package me.nilpoint.gof.observer.complex;

/**
 *
 * Created by john on 2016/2/8 0008.
 */
public class Observer2 implements IObserver {
  @Override
  public void update(int i) {
    System.out.println("Observer2: observes ->myValue is changed in\n" + "Subject to :" + i);
  }
}
