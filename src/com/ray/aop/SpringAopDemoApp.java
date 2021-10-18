package com.ray.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ray.aop.dao.AccountDAO;

public class SpringAopDemoApp {

	public static void main(String[] args) {
		// read spring configuration class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
//		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
//		
//		Account myAccount = new Account();
//		myAccount.setName("myAccountNameIsRay");
//		myAccount.setLevel("myLevelIsMaster");
//
//		theAccountDAO.addAccount(myAccount, true);
//		
//		theAccountDAO.doAnything();
//		
//		theMembershipDAO.addMembership();
//		
//		
//		theAccountDAO.setName("myName");
//		theAccountDAO.setServiceCode("myService");
//		theAccountDAO.getName();
//		theAccountDAO.getServiceCode();
		
		List<Account> theAccounts = theAccountDAO.findAccounts();
		System.out.println("\nMainPropram: demo afterReturning aspect");
		System.out.println("---------------------");
		
		System.out.println(theAccounts);
		System.out.println("\n");
		
		context.close();
	}

}
