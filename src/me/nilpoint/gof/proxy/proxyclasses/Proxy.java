package me.nilpoint.gof.proxy.proxyclasses;

import me.nilpoint.gof.proxy.originalclasses.ConcreteSubject;
import me.nilpoint.gof.proxy.originalclasses.Subject;

/**
 *
 * Created by john on 2016/2/9 0009.
 */
public class Proxy extends Subject {
  ConcreteSubject cs;

  @Override
  public void doSomething() {
    System.out.println("Proxy call happening now.");

    // Lazy initialization
    if (cs == null) {
      cs = new ConcreteSubject();
    }
    cs.doSomething();
  }
}
