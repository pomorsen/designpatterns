package designpatterns.creational.singleton.ex_3_static_dbsingleton_lazy_loading;

public class Demo {
  public static void main(String[] args) {
    DBSingleton dbSingletonInstance1 = DBSingleton.getInstance();
    DBSingleton dbSingletonInstance2 = DBSingleton.getInstance();
    System.out.println(dbSingletonInstance1);

    System.out.println(dbSingletonInstance1==dbSingletonInstance2);
  }
}
