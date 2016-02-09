package me.nilpoint.gof.decorator;

/**
 *
 * Created by john on 2016/2/9 0009.
 */
abstract class AbstractDecorator extends Component {
  protected Component component;

  public void SetTheComponent(Component c) {
    component = c;
  }

  @Override
  public void doJob() {
    if (component != null) {
      component.doJob();
    }
  }
}
