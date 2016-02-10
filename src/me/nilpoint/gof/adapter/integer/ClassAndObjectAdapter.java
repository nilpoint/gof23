package me.nilpoint.gof.adapter.integer;

/**
 *
 * Created by john on 2016/2/10 0010.
 */
public class ClassAndObjectAdapter {
  public static void main(String[] args) {
    System.out.println("***Class and Object Adapter Demo***");

    ClassAdapter ca1 = new ClassAdapter();
    System.out.println("Class Adapter is returning :" + ca1.getInteger());

    ObjectAdapter oa = new ObjectAdapter(new IntegerValue());
    System.out.println("Object Adapter is returning :" + oa.getInteger());
  }
}
