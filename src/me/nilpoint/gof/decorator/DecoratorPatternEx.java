package me.nilpoint.gof.decorator;

/**
 *
 * Created by john on 2016/2/9 0009.
 */
class DecoratorPatternEx {
  public static void main(String[] args) {
    System.out.println("***Decorator pattern Demo***");

    ConcreteComponent cc = new ConcreteComponent();

    ConcreteDecoratorEx_1 cd1 = new ConcreteDecoratorEx_1();
    // Decorating ConcreteComponent Object
    // cc with ConcreteDecoratorEx_1
    cd1.SetTheComponent(cc);
    cd1.doJob();

    ConcreteDecoratorEx_2 cd2 = new ConcreteDecoratorEx_2();
    // Decorating ConcreteComponent Object
    // cc with ConcreteDecoratorEx_1 &
    // ConcreteDecoratorEX_2
    cd2.SetTheComponent(cd1);
    //Adding results from cd_1 now
    cd2.doJob();
  }
}
