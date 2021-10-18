package com.ray.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoApiAnalyticsAspect {
	@Before("com.ray.aop.aspect.AopExpressionLanguage.forDaoPackageWithoutGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\n===> Performing API Analytics");
	}
}
