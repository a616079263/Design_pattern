package zc.com.pattern.service.proxy.impl;

import zc.com.pattern.service.proxy.IDBQuery;

/**
 * Created by Administrator on 2017/3/7.
 * 代理类
 */
public class DBQueryProxy implements IDBQuery {

    private DBQuery real = null;

    @Override
    public String request() {
        //在需要的时候创建对象
        if(real==null){
            real = new DBQuery();
        }
        //在多线程的情况下返回一个虚假类，类似于future模式（并发设计模式）
        return real.request();
    }

    public static void main(String[] args) {
        IDBQuery query = new DBQueryProxy();//使用代理
        query.request();//在真正使用的时候创建真实对象
    }
}
