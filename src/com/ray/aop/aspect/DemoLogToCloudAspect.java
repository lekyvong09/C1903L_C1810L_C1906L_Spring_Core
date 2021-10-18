package com.ray.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class DemoLogToCloudAspect {
	@Before("com.ray.aop.aspect.AopExpressionLanguage.forDaoPackageWithoutGetterSetter()")
	public void logToCloud() {
		System.out.println("\n===> Write log to cloud!");
	}
}
