package com.ray.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(4)
public class DemoLoggingAspect {

	@Before("com.ray.aop.aspect.AopExpressionLanguage.forDaoPackageWithoutGetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n===> Executing @Before advice on addAccount()");
	}	
}
