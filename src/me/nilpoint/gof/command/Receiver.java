package me.nilpoint.gof.command;

/**
 *
 * Created by john on 2016/2/10 0010.
 */
public class Receiver {
  public void performUndo()
  {
    System.out.println("Executing -MyUndoCommand");
  }
  public void performRedo()
  {
    System.out.println("Executing -MyRedoCommand");
  }
}
