package zc.com.pattern.service.proxy.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public abstract class DynamicProxy<T> {

	/**
	 * 泛型代理类
	 * */
	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(ClassLoader loader,
			Class<?>[] interfaces, InvocationHandler h) {
		T resultObj = null;
		try {
			resultObj = (T) Proxy.newProxyInstance(loader, interfaces, h);
		} catch (IllegalArgumentException e) {
			System.out.println("执行校验数据出现异常,请检查数据完整性");
			throw new IllegalArgumentException(e);
		}
		return resultObj;
	}
	 
}
