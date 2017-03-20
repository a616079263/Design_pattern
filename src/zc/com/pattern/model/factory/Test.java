package zc.com.pattern.model.factory;

/**
 * Created by Administrator on 2017/3/13.
 */
public class Test {
    public static void main(String[] args) {
        LeiFeng leiFeng = new Unergraduate();
        leiFeng.BuyRice();
        leiFeng.Sweep();
        leiFeng.Wash();
    }
}
