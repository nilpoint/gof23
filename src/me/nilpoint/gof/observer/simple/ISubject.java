package me.nilpoint.gof.observer.simple;

/**
 *
 * Created by john on 2016/2/8 0008.
 */
public interface ISubject {
  void register(Observer o);
  void unregister(Observer o);
  void notifyObservers();
}
