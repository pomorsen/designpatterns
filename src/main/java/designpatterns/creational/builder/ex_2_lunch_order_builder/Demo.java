package designpatterns.creational.builder.ex_2_lunch_order_builder;

public class Demo {
  public static void main(String[] args) {
    LunchOrder lunchOrder =
        LunchOrder.builder().bread("b1").condiments("c1").dressing("d1").meat("m1").build();
  }
}
