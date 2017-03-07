package zc.com.pattern.service.proxy.impl;

import zc.com.pattern.service.proxy.IDBQuery;

/**
 * Created by Administrator on 2017/3/7.
 * 真实主题
 */
public class DBQuery implements IDBQuery {

    public DBQuery() {
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String request() {
        return "request string";
    }
}
