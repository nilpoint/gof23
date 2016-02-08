package me.nilpoint.gof.observer.assignment;

/**
 *
 * Created by john on 2016/2/8 0008.
 */
public class ObserverPatternAssignmentEx {
  public static void main(String[] args) {
    Subject1 subject1 = new Subject1();
    Subject2 subject2 = new Subject2();

    Observer1 observer1 = new Observer1();
    Observer2 observer2 = new Observer2();
    Observer3 observer3 = new Observer3();

    subject1.register(observer1);
    subject1.register(observer3);
    subject2.register(observer2);
    subject2.register(observer3);

    subject1.setMyValue(15);
    subject2.setMyValue(25);

    subject2.unregister(observer3);

    subject1.setMyValue(55);
    subject2.setMyValue(555);
  }
}
