package me.nilpoint.gof.command;

/**
 *
 * Created by john on 2016/2/10 0010.
 */
public class MyUndoCommand implements ICommand {
  private Receiver receiver;

  public MyUndoCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void Do() {
    // Call undo in receiver
    receiver.performUndo();
  }
}
