package zc.com.pattern.model.singleton;

/**
 * Created by Administrator on 2017/3/6.
 */
public class StaticSingleton {
    /**
     * 内部类的单例模式
     * 这个类被初始化的时候不会加载单例模式，性能最好
     */
    public StaticSingleton() {
        System.out.print("创建单例模式");
    }
    private  static  class  SingletinHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }
    public static StaticSingleton getInstance(){
        return SingletinHolder.instance;
    }

}
