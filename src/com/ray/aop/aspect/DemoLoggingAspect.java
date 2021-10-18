package com.ray.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

	// AOP Pointcut expression language
	@Pointcut("execution(* com.ray.aop.dao.*.*(..))")
	private void forDaoPackage() { }
	
	@Pointcut("execution(* com.ray.aop.dao.*.get*(..))")
	private void getter() {}
	
	@Pointcut("execution(* com.ray.aop.dao.*.set*(..))")
	private void setter() {}
	
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageWithoutGetterSetter() { }
	
	
	@Before("forDaoPackageWithoutGetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n===> Executing @Before advice on addAccount()");
	}
	
	
	@Before("forDaoPackageWithoutGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\n===> Performing API Analytics");
	}
}
