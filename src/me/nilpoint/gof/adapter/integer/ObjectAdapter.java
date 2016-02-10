package me.nilpoint.gof.adapter.integer;

/**
 *
 * Created by john on 2016/2/10 0010.
 */
public class ObjectAdapter {
  private IIntegerValue iIntegerValue;

  public ObjectAdapter(IIntegerValue myInt) {
    this.iIntegerValue = myInt;
  }

  //Incrementing by 2
  public int getInteger() {
    return 2 + iIntegerValue.getInteger();
  }
}
