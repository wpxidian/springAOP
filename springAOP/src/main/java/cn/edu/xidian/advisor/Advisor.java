package cn.edu.xidian.advisor;

import java.lang.reflect.Method;

public interface Advisor {
	
	public void doingAdvisor(Object proxy, Method method, Object[] args) ;
}
