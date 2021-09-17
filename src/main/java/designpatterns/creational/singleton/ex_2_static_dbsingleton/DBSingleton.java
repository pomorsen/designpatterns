package designpatterns.creational.singleton.ex_2_static_dbsingleton;

public class DBSingleton {
    private static final DBSingleton instance = new DBSingleton();

    private DBSingleton() {}

    public static DBSingleton getInstance(){
        return instance;
    }

}
