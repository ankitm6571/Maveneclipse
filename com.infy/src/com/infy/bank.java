package com.infy;

class Bank{
	String bankName,area,phoneNo;
	 Bank(){
		System.out.println("inside constructor");
	}
	public static void main(String args[]){
		Bank bank=new Bank();
		System.out.println(bank.bankName);
	}
}