package me.nilpoint.gof.command;

/**
 *
 * Created by john on 2016/2/10 0010.
 */
public class Invoke {
  ICommand command;
  public void ExecuteCommand(ICommand cmd) {
    this.command = cmd;
    command.Do();
  }
}
