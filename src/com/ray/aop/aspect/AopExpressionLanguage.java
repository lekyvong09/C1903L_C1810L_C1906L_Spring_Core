package com.ray.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class AopExpressionLanguage {
	// AOP Pointcut expression language
	@Pointcut("execution(* com.ray.aop.dao.*.*(..))")
	private void forDaoPackage() { }
	
	@Pointcut("execution(* com.ray.aop.dao.*.get*(..))")
	private void getter() {}
	
	@Pointcut("execution(* com.ray.aop.dao.*.set*(..))")
	private void setter() {}
	
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageWithoutGetterSetter() { }
	
}
