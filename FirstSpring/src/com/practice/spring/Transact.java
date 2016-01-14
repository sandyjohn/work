package com.practice.spring;

public class Transact {
	
	private Account accClasSet;

	public void transact(){
	System.out.println("Hello "+accClasSet.getName());	
	}
	public Account getAccClasSet() {
		return accClasSet;
	}

	public void setAccClasSet(Account accClasSet) {
		this.accClasSet = accClasSet;
	}

	
}
