package me.nilpoint.gof.decorator;

/**
 *
 * Created by john on 2016/2/9 0009.
 */
class ConcreteDecoratorEx_1 extends AbstractDecorator {
  @Override
  public void doJob() {
    super.doJob();

    // Add additional thing if necessary
    System.out.println("I am explicitly from Ex_1");
  }
}
