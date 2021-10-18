package com.ray.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ray.aop.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;
	
	
	public List<Account> findAccounts() {
		List<Account> myAccounts = new ArrayList();
		
		Account account1 = new Account("Ray", "Gold");
		Account account2 = new Account("Tommy", "Diamond");
		
		myAccounts.add(account1);
		myAccounts.add(account2);
		
		return myAccounts;
	}
	
	public void addAccount(Account theAccount, boolean isVIP) {
		// doing some logic tasks...............
		System.out.println(getClass() + ": Doing some DB work - adding account");
	}
	
	public boolean doAnything() {
		System.out.println(getClass() + ": Doing anything");
		return true;
	}

	public String getName() {
		System.out.println(getClass() + ": getName");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": setName");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": getServiceCode");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": setServiceCode");
		this.serviceCode = serviceCode;
	}
	
	
}
