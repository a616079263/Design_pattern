package zc.com.pattern.test;

import zc.com.pattern.model.factory.LeiFeng;
import zc.com.pattern.service.factory.IFactory;
import zc.com.pattern.service.factory.impl.UnergraduateFactoryImpl;

/**
 * Created by Administrator on 2017/3/13.
 */
public class Test {
    public static void main(String[] args) {
        IFactory factory = new UnergraduateFactoryImpl();
        LeiFeng leiFeng = factory.CreateFactory();
        leiFeng.Wash();
        leiFeng.Sweep();
        leiFeng.BuyRice();
    }
}
