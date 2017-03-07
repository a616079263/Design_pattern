package zc.com.pattern.service.proxy.impl;

import zc.com.pattern.service.proxy.IDBQuery;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/3/7.
 */
public class JdkDbQeueryHandler implements InvocationHandler {
    IDBQuery real = null;  //主题接口
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (real == null){
            real = new DBQuery();
        }
        return real.request();
    }
}
