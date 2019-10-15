package com.practice.spring;

public class Account {
	
	// added comments in master
	// test in master
	private String name;
	private int accNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public void withDraw(){
		System.out.println("this is main account");
		System.out.println("Welcome "+getName()+"!your acc num is:"+getAccNumber());
		
	}
	
}
