package com.ray.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ray.aop.Account;

@Aspect
@Component
@Order(4)
public class DemoLoggingAspect {

	@Before("com.ray.aop.aspect.AopExpressionLanguage.forDaoPackageWithoutGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("\n===> Executing @Before advice on addAccount()");
		
		System.out.println("Method: " + theJoinPoint.getSignature());
		
		Object[] args = theJoinPoint.getArgs();
		
		for (Object tempArg : args) {
			
			if (tempArg instanceof Account) {
				Account theAccount = (Account) tempArg;
				System.out.println("accountName: " + theAccount.getName());
				System.out.println("accountLevel: " + theAccount.getLevel());
			}
		}
	}	
}
