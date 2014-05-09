package cn.edu.xidian.advisor.impl;

import java.lang.reflect.Method;

import cn.edu.xidian.advisor.Advisor;

public class BeforeAdvisor implements Advisor {

	public void doingAdvisor(Object proxy, Method method, Object[] args) {
		System.out.println(method.getName() + "方法之前的增强处理");
	}

}
