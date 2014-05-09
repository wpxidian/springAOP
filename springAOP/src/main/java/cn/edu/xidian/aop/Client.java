package cn.edu.xidian.aop;

import cn.edu.xidian.bean.UserManager;
import cn.edu.xidian.beanFactory.BeanFactory;

public class Client {
	
	public static void main(String[] args){
		
		BeanFactory factory = new BeanFactory() ;
		factory.init("applicationContext.xml") ;
		
		UserManager userManager = (UserManager) factory.getBean("userManager") ;
		
		userManager.addUser() ;
	}
}
