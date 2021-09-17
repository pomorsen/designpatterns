package designpatterns.creational.builder.ex_1_lunch_order;

public class Demo {
  public static void main(String[] args) {
    LunchOrder lunchOrder =
        LunchOrder.builder().bread("b1").condiments("c1").dressing("d1").meat("m1").build();

//    LunchOrder lunchOrder1 = LunchOrderBuilder
  }
}
