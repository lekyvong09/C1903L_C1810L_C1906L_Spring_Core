package com.ray.aop.dao;

import org.springframework.stereotype.Component;

import com.ray.aop.Account;

@Component
public class AccountDAO {
	public void addAccount(Account theAccount, boolean isVIP) {
		// doing some logic tasks...............
		System.out.println(getClass() + ": Doing some DB work - adding account");
	}
}
