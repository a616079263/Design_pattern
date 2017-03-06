package zc.com.pattern.model.singleton;

/**
 * Created by Administrator on 2017/3/6.
 */
public class SingLeton {
    /**
     * 单例模式第一种形式，不是最好的
     * 缺点当使用此类任何方法的时候这个单例模式的对象都会被创建
     */
    public SingLeton() {
        System.out.print("单例模式的生成");
    }
    private  static  SingLeton instance = new SingLeton();

    public static SingLeton getInstance(){
        return instance;
    }
}
