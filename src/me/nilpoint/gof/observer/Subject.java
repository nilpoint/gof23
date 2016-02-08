package me.nilpoint.gof.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by john on 2016/2/8 0008.
 */
public class Subject implements ISubject {
  private List<Observer> observerList = new ArrayList<Observer>();
  private int _flag;

  @Override
  public void register(Observer o) {
    observerList.add(o);
  }

  @Override
  public void unregister(Observer o) {
    observerList.remove(o);
  }

  @Override
  public void notifyObservers() {
    for (Observer o : observerList) {
      o.update();
    }
  }

  public int getFlag() {
    return _flag;
  }

  public void setFlag(int flag) {
    this._flag = flag;

    //flag value changed .So notify observer(s)
    notifyObservers();
  }
}
