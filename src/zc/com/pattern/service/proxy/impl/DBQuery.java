package zc.com.pattern.service.proxy.impl;

import zc.com.pattern.service.proxy.IDBQuery;

/**
 * Created by Administrator on 2017/3/7.
 */
public class DBQuery implements IDBQuery {

    @Override
    public String request() {
        return "request string";
    }
}
