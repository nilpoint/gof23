package me.nilpoint.gof.observer.complex;

/**
 *
 * Created by john on 2016/2/8 0008.
 */
public interface ISubject {
  void register(IObserver o);
  void unregister(IObserver o);
  void notifyObservers(int i);
}
