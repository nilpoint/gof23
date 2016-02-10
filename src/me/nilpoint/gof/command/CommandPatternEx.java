package me.nilpoint.gof.command;

/**
 *
 * Created by john on 2016/2/10 0010.
 */
public class CommandPatternEx {
  public static void main(String[] args) {
    System.out.println("***Command Pattern Demo***\n");
    Receiver receiver = new Receiver();
    /*Client holds Invoker and Command Objects*/
    Invoke invoker = new Invoke();
    MyRedoCommand reCmd = new MyRedoCommand(receiver);
    MyUndoCommand unCmd = new MyUndoCommand(receiver);
    invoker.ExecuteCommand(unCmd);
    invoker.ExecuteCommand(reCmd);
  }
}
