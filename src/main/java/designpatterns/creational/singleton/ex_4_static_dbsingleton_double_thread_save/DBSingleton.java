package designpatterns.creational.singleton.ex_4_static_dbsingleton_double_thread_save;

public class DBSingleton {
  private static DBSingleton instance = null;

  private DBSingleton() {
    // prevent reflection
    if (instance != null) {
      throw new RuntimeException("Use getInstance() method to create!");
    }
  }

  public static DBSingleton getInstance() {
    if (instance == null) {
      // thread save
      synchronized (DBSingleton.class) {
        instance = new DBSingleton();
      }
    }
    return instance;
  }
}
