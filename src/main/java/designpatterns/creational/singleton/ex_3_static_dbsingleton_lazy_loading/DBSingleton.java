package designpatterns.creational.singleton.ex_3_static_dbsingleton_lazy_loading;

public class DBSingleton {
  private static DBSingleton instance = null;

  private DBSingleton() {}

  public static DBSingleton getInstance() {
    if (instance == null) {
      instance = new DBSingleton();
    }
    return instance;
  }
}
