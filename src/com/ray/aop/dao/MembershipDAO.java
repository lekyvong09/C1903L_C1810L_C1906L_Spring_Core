package com.ray.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addAccount() {
		// doing some logic tasks...............
		System.out.println(getClass() + ": Doing some DB work - adding account");
	}
}