package zc.com.pattern.model.singleton;

/**
 * Created by Administrator on 2017/3/6.
 */
public class SingLeton {
    public SingLeton() {
        System.out.print("单例模式的生成");
    }
    private  static  SingLeton instance = new SingLeton();
    public static SingLeton getInstance(){
        return instance;
    }
}
