package me.nilpoint.gof.command;

/**
 *
 * Created by john on 2016/2/10 0010.
 */
public class MyRedoCommand implements ICommand {
  private Receiver receiver;

  public MyRedoCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void Do() {
    //Call redo in receiver
    receiver.performRedo();
  }
}
