package zc.com.pattern.service.factory.impl;

import zc.com.pattern.model.factory.LeiFeng;
import zc.com.pattern.model.factory.Unergraduate;
import zc.com.pattern.service.factory.IFactory;

/**
 * Created by Administrator on 2017/3/13.
 */
public class UnergraduateFactoryImpl implements IFactory {
    @Override
    public LeiFeng CreateFactory() {
        return new Unergraduate();
    }
}
