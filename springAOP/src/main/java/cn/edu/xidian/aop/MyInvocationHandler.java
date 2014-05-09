package cn.edu.xidian.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import cn.edu.xidian.advisor.Advisor;

public class MyInvocationHandler implements InvocationHandler {
	
	private Object targetObj ;
	
	private Advisor beforeAdvisor ;
	
	public void setBeforeAdvisor(Advisor beforeAdvisor) {
		this.beforeAdvisor = beforeAdvisor;
	}
	public void setAfterAdvisor(Advisor afterAdvisor) {
		this.afterAdvisor = afterAdvisor;
	}
	private Advisor afterAdvisor ;
	
	public MyInvocationHandler(Object targetObj){
		this.targetObj = targetObj ;
	}
	/**
	 * 创建一个代理对象
	 * @return
	 */
	public Object newProxy(){
		return Proxy.newProxyInstance(targetObj.getClass().getClassLoader(), targetObj.getClass().getInterfaces(), this) ;
	}
	/**
	 * 
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		/**
		 * 目标方法调用之前的增强处理
		 */
		if(beforeAdvisor != null){
			beforeAdvisor.doingAdvisor(proxy, method, args) ;
		}
		Object obj = method.invoke(targetObj, args) ;
		/**
		 * 目标方法调用之后的增强处理
		 */
		if(afterAdvisor != null){
			afterAdvisor.doingAdvisor(proxy, method, args) ;
			
		}
		return obj;
	}


}
