package me.nilpoint.gof.proxy.demo;

import me.nilpoint.gof.proxy.proxyclasses.Proxy;

/**
 *
 * Created by john on 2016/2/9 0009.
 */
public class ProxyPatternEx {
  public static void main(String[] args) {
    System.out.println("***Proxy Pattern Demo***\n");

    Proxy proxy = new Proxy();
    proxy.doSomething();
  }
}
