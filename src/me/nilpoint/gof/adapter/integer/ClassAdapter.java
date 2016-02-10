package me.nilpoint.gof.adapter.integer;

/**
 *
 * Created by john on 2016/2/10 0010.
 */
public class ClassAdapter extends IntegerValue {
  //Incrementing by 2
  @Override
  public int getInteger() {
    return 2 + super.getInteger();
  }
}
