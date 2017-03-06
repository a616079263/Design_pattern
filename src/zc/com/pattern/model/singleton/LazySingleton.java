package zc.com.pattern.model.singleton;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by Administrator on 2017/3/6.
 */
public class LazySingleton {
    /**
     * 延迟加载的单例模式
     * 使用线程的方式创建了类速度变快，但是系统性能降低
     */
    public LazySingleton() {
        System.out.println("创建单例模式的过程");
    }

    private  static LazySingleton instance = null;
    public  static  synchronized LazySingleton getInstance (){
        if (instance == null){
            instance = new LazySingleton();
        }
        return  instance;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            LazySingleton.getInstance();
        }
        System.out.print("spend------>"+(System.currentTimeMillis()-start));
    }
}
