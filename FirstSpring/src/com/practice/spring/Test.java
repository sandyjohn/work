package com.practice.spring;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Test {

	public static void main(String args[]){
		
	BeanFactory fac=new XmlBeanFactory(new FileSystemResource("bean.xml"));
	//Account a=new Account();
	//a.withDraw();;
	// adding in master
	Account a=(Account)fac.getBean("acc");
	a.withDraw();
	
	Transact t=(Transact)fac.getBean("tran");
	t.transact();
	}
}
