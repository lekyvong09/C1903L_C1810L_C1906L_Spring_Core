package com.ray.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ray.aop.dao.AccountDAO;
import com.ray.aop.dao.MembershipDAO;

public class SpringAopDemoApp {

	public static void main(String[] args) {
		// read spring configuration class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		

		theAccountDAO.addAccount(new Account(), true);
		
		theAccountDAO.doAnything();
		
		theMembershipDAO.addMembership();
		
		
		theAccountDAO.setName("myName");
		theAccountDAO.setServiceCode("myService");
		theAccountDAO.getName();
		theAccountDAO.getServiceCode();
		
		context.close();
	}

}
