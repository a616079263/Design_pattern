package zc.com.pattern.service.proxy.util;

import java.lang.reflect.InvocationHandler;

/**
 * 校验具体代理
 * 
 * @author kuisheng.li
 */
public class SeniorDynamicProxy extends DynamicProxy {
	/**
	 * 校验代理
	 * @param clazz
	 * @return
	 * @throws Exception
	 */
	public static <T> T newProxyInstance(Class<?> clazz) throws Exception {
		ClassLoader loader = clazz.getClassLoader();
		Class<?>[] interfaces = clazz.getInterfaces();
		Object obj=null;
		try {
			obj = clazz.newInstance();
		} catch (InstantiationException e) {
			throw new InstantiationException(e.getMessage());
		} catch (IllegalAccessException e) {
			throw new IllegalAccessException(e.getMessage());
		}
		InvocationHandler h = new ProxyInvocationHandler(obj);
		return newProxyInstance(loader, interfaces, h);
	}

	 
}
