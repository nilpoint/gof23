package me.nilpoint.gof.decorator;

/**
 *
 * Created by john on 2016/2/9 0009.
 */
class ConcreteDecoratorEx_2 extends AbstractDecorator {
  @Override
  public void doJob() {
    System.out.println("");
    System.out.println("***START Ex-2***");

    super.doJob();

    // Add additional thing if necessary
    System.out.println("Explicitly From DecoratorEx_2");
    System.out.println("***END. EX-2***");
  }
}
