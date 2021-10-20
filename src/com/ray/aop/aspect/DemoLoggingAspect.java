package com.ray.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	
	
	@AfterReturning(pointcut="execution(* com.ray.aop.dao.AccountDAO.findAccounts(..))", 
			returning="outputResult")
	public void afterReturningFindAccoundAdvice(JoinPoint theJoinPoint, 
			List<Account> outputResult) {
		
		System.out.println("\n===> Executing @AfterReturning on method: " + theJoinPoint.getSignature());
		
		System.out.println(outputResult);
	}
	
	
	@AfterThrowing(pointcut="execution(* com.ray.aop.dao.AccountDAO.findAccounts(..))",
			throwing="theException")
	public void afterThrowingFindAccountAdvice(JoinPoint theJoinPoint, Throwable theException) {
		System.out.println("\n===> The exception is: " + theException);
		
	}
	
	
	@After("execution(* com.ray.aop.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountAdvice(JoinPoint theJoinPoint) {
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n===> Executing @After (finally) on method: " + method);
	}
	
	
	// @Around = @Before + @After 
	@Around("execution(* com.ray.aop.service.TrafficFortuneService.getFortune(..))")
	public Object aroundGetFortuneService(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {
		System.out.println("\n===> Executing @Around on method: " + theProceedingJoinPoint.getSignature().toShortString());
		
		// get begin time stamp
		long begin = System.currentTimeMillis();
		
		// now execute the method
		Object result = theProceedingJoinPoint.proceed();
		
		// get end time stamp
		long end = System.currentTimeMillis();
		
		// calculate duration
		long duration = end - begin;
		
		System.out.println("\n===> Dureation: " + duration / 1000.0 + " seconds");
		
		return result;
	}
	
}
