package com.annotations.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container= new ClassPathXmlApplicationContext("config_annotations.xml");
		Employee emp = (Employee) container.getBean("employee");
		System.out.println(emp);
		
	}

}
