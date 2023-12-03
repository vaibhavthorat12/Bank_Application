
package org.jsp.bank_account;

import java.util.Scanner;

public class Bank_Driver {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the bank name to open account");
		String bname = s.next();
		System.out.println("enter address of bank");
		String loc = s.next();
		System.out.println("enter bank ifc_code");
		String ifc=s.next();
		Bank b = new Bank(bname,loc,ifc);
		
//	//	b.bankDetails();
//	//	b.createAccount("Chirag","07/11/1999","1234",500);
//		b.createAccount(new Account("vaibhav","25/04/1998","1234",1500,123456));
//		b.bankDetails();
//		//b.createAccount(new Account("Amit","07/11/1999","1234",500));
//		//b.bankDetails();
//	//	b.deposite(123456,500);
//	//	b.bankDetails();
//		b.withdrawl(123456, 1500);
//		b.bankDetails();
////		b.deleteAccount();
////		b.bankDetails();

		
		boolean option = true;
		while(option) {
			System.out.println("Enter your choice");
			System.out.println("enter 1.for CREATE ACCOUNT");
			System.out.println("enter 2 for check  details");
			System.out.println("enter 3  for   DEPOSITE MONEY");
			System.out.println("enter 4 for WITHDRAW");
			System.out.println("enter 5 for DELETE ACCOUNT");
			System.out.println("enter 6 fpr EXIT OR close APPLICATION");
		
		
		int choice = s.nextInt();
		switch(choice) {
		case 1 : {
			System.out.println("enter name");
			String name =  s.next();
			System.out.println("enter dob");
			String dob =  s.next();
			System.out.println("enter pin");
			String pin = s.next();
			System.out.println("enter money to deposite");
			double money = s.nextDouble();
			System.out.println("enter account number of your choice");
			long ano  =s.nextLong();
			b.createAccount(new Account(name,dob,pin,money,ano));
			System.out.println("=================================");
		}
		break;
		case 2 : {
			b.bankDetails();
			System.out.println("==================================");
		}
		break;
		case 3 : {
			System.out.println("enter account number to deposite money");
			long ano1 = s.nextLong();
			System.out.println("enter  how much money u want to deposite");
			double money1 =  s.nextDouble();
			b.deposite(ano1, money1);
			System.out.println("=======================================");
		}
		break;
		case 4 : {
			System.out.println("enter account number to withdraw money");
			long ano1 = s.nextLong();
			System.out.println("enter how much money u want to withdraw");
			double money1 = s.nextDouble();
			b.withdrawl(ano1, money1);
			System.out.println("=========================================");
		}
		break;
		case 5 : {
			b.deleteAccount();
		}
		break;
		case 6 : {
			System.out.println("Thank you using "+ bname);
			System.out.println("Have a good day....");
			option = false;
		}
		break;
		default : {
			System.out.println("Enter your valid choice ");
			break;
		}
		}
		}
	}
	}
