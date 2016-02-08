package me.nilpoint.gof.observer.assignment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by john on 2016/2/8 0008.
 */
public class Subject2 implements ISubject {
  private List<IObserver> observerList = new ArrayList<IObserver>();
  private int myValue;

  public int getMyValue() {
    return myValue;
  }

  public void setMyValue(int myValue) {
    this.myValue = myValue;
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
  public void notifyObservers(int value) {
    for (IObserver o : observerList) {
      o.update("SUBJECT2", value);
    }
  }
}
