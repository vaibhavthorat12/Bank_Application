package org.jsp.bank_account;
import java.util.Scanner;

public class Bank {
	   String bname;
	   String loc;
	   String ifc_code;
	   
	   Account a;

	public Bank(String bname, String loc, String ifc_code) {
		this.bname = bname;
		this.loc = loc;
		this.ifc_code = ifc_code;
	}
	 public void bankDetails() {
		  System.out.println(bname);
		  System.out.println(loc);
		  System.out.println(ifc_code);
		  
		  if(this.a !=null) {
			  System.out.println(a.account_holder_name);
			  System.out.println(a.dob);
			  System.out.println(a.pin);
			  System.out.println(a.money);
		  }
	      else {
	    	  System.out.println("to check bank details open Account first");
				  
		  }
	  }
		// public void createAccount(String account_holder_name, String dob, String pin,double money) {
		//	 a = new Account(account_holder_name,dob,pin,money);
	  public void createAccount(Account a) {
		   if(this.a == null) {
			   this.a = a;
			   System.out.println("Account successfuly created");
			}
		    else {
			   System.out.println("already account is exiting");
			}
	   }
	   
	  public void deposite(long ano,double money) {
			if(a.ano == ano) {
				if(money != 0) {
					a.money=a.money+money;
					System.out.println("deposite amount is "+money);
					System.out.println("total balnce is"+a.money);
				}
				else {
					System.out.println("enter the valid amount to add in account");
				}
				
			}
			else {
				System.out.println("enter  valid account number");
			}
		}
		
	  
	  	public void withdrawl(long ano ,double money) {
			if(a.ano==ano) {
				if(a.money>=money) {
					a.money=a.money-money;
					System.out.println("withdrwal amount is "+money);
					System.out.println("total amount is "+a.money);
				}
				else {
					System.out.println("insufficiesnt");
				}
			}
			
			else {
				System.out.println("enter valid account numbefr");
			}
		}
		
		
		public void deleteAccount() {
			this.a=null;
			System.out.println("account deleted sucessfully");
		}
}
