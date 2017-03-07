package zc.com.pattern.model.singleton;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/7.
 */
public class SerSingleton implements Serializable {
    private String name;

    public SerSingleton() {
        name = "SerSingleton";
    }

    public SerSingleton(String name) {
        this.name = name;
    }
    private static SerSingleton instance= new SerSingleton();

    public static void createString(){
        System.out.println("创建单例模式");
    }

    private Object readResolve(){
        return instance;
    }
}
