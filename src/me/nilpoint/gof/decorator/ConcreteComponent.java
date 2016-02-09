package me.nilpoint.gof.decorator;

/**
 *
 * Created by john on 2016/2/9 0009.
 */
public class ConcreteComponent extends Component {

  @Override
  public void doJob() {
    System.out.println(" I am from concrete Component-I am closed for modification.");
  }
}
