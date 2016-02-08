package me.nilpoint.gof.observer.complex;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by john on 2016/2/8 0008.
 */
public class Subject implements ISubject {
  List<IObserver> observerList = new ArrayList<IObserver>();

  private int myValue;

  public int getMyValue() {
    return myValue;
  }

  public void setMyValue(int myValue) {
    this.myValue = myValue;

    //Notify observers
    notifyObservers(myValue);
  }

  @Override
  public void register(IObserver o) {
    observerList.add(o);
  }

  @Override
  public void unregister(IObserver o) {
    observerList.remove(o);
  }

  @Override
  public void notifyObservers(int i) {
    for (IObserver o : observerList) {
      o.update(i);
    }
  }
}
