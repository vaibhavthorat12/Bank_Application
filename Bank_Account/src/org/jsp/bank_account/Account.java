package org.jsp.bank_account;

import java.util.Scanner;

public class Account { 
		String account_holder_name;
		String dob;
		String pin;
		double money;
		long ano;
	public Account(String account_holder_name, String dob, String pin, double money,long ano) {
		this.account_holder_name = account_holder_name;
		this.dob = dob;
		this.pin = pin;
		this.money = money;
		this.ano=ano;
	}
	public void accountDetails() {
		  System.out.println(account_holder_name);
		  System.out.println(dob);
		  System.out.println(ano);
		  System.out.println(pin);
		  System.out.println(money);
	}
    
    
}
