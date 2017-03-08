package zc.com.pattern.service.proxy.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvocationHandler implements InvocationHandler {
	private Object target = null;

	/**
	 * 泛型代理
	 * */
	public ProxyInvocationHandler(Object object) {
		this.target = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(this.target, args);
	}

}
