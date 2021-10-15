package com.ray.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ray.aop.dao.AccountDAO;

public class SpringAopDemoApp {

	public static void main(String[] args) {
		// read spring configuration class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		theAccountDAO.addAccount();
		
		context.close();
	}

}
