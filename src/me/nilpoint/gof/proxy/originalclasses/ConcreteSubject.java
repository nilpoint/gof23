package me.nilpoint.gof.proxy.originalclasses;

/**
 *
 * Created by john on 2016/2/9 0009.
 */
public class ConcreteSubject extends Subject   {

  @Override
  public void doSomething() {
    System.out.println(" I am from concrete object.");
  }
}
