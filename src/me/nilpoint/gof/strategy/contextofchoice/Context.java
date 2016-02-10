package me.nilpoint.gof.strategy.contextofchoice;

import me.nilpoint.gof.strategy.choices.IChoice;

/**
 *
 * Created by john on 2016/2/10 0010.
 */
public class Context {
  IChoice myC;

  public void SetChoice(IChoice choice) {
    myC = choice;
  }

  public void ShowChoice(String s1, String s2) {
    myC.myChoice(s1, s2);
  }
}
