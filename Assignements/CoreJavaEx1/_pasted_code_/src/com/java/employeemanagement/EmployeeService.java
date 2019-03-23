package com.java.employeemanagement;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeService {
	TreeMap <Integer,Employees>map=new TreeMap<Integer,Employees>();    

	Scanner sc=new Scanner(System.in);
	public void addEmployee()
	{
		System.out.println("add method called");
		System.out.println("Enter Employee Name:");
		String eName=sc.next();
		System.out.println("Enter Employee id:");
		int id=sc.nextInt();
		System.out.println("Enter Employee designation:");
		String designation=sc.next();
		System.out.println("Enter Employee department:");
		String dept=sc.next();
		System.out.println("Enter Employee Salary:");
		double sal=sc.nextDouble();

		Employees e =new Employees(eName, id, designation, dept, sal);
		map.put(e.getEmpId(),e);
		//System.out.println(eName+","+ id +","+ designation+","+dept+","+ sal);
		System.out.println(e);
	}
	
	public void updateEmployee(int id)
	{
		if(map.containsKey(id))
		{
		System.out.println("update employee "+id);
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter designation:");
		String designation=sc.next();
		System.out.println("Enter dept:");
		String dept=sc.next();
		System.out.println("Enter salary");
		double salary=sc.nextDouble();
		Employees e=new Employees(name, id, designation, dept, salary);
		
		map.replace(id, e);
		}else {
			System.out.println("No employee with id "+ id +" exist");
		}


	}
	
	public void viewEmployeeById(int id)
	
	{
		if(map.containsKey(id))
		{
		System.out.println("view employee "+ id);
		 System.out.println("Name: "+map.get(id).getEmpName());
		 System.out.println("ID: "+map.get(id).getEmpId());
		 System.out.println("Department: "+map.get(id).getDepartment());
		 System.out.println("Designation: "+map.get(id).getDesignation());
		 System.out.println("Salary: "+map.get(id).getSalary());
		 
		}else {
			System.out.println("No employee with id "+ id +" exist");

		}
		
	}
	public void viewEmployees()
	{
		System.out.println("View all method called");
		 for(Object o:map.keySet()) {
			 System.out.println("Name: "+map.get(o).getEmpName());
			 System.out.println("ID: "+map.get(o).getEmpId());
			 System.out.println("Department: "+map.get(o).getDepartment());
			 System.out.println("Designation: "+map.get(o).getDesignation());
			 System.out.println("Salary: "+map.get(o).getSalary());
			 
		 }
	}
	public void deleteEmployee(int id) {
		if(map.containsKey(id))
		{
		map.remove(id);
		System.out.println("deleted Employee "+ id);
		for(Object o:map.keySet()) {
			 System.out.println("Name: "+map.get(o).getEmpName());
			 System.out.println("ID: "+map.get(o).getEmpId());
			 System.out.println("Department: "+map.get(o).getDepartment());
			 System.out.println("Designation: "+map.get(o).getDesignation());
			 System.out.println("Salary: "+map.get(o).getSalary());
			 
		 }
		}else {
			System.out.println("No employee with id "+ id +" exist");

		}

		
		
	}
	
	public void statistics()
	{
		System.out.println("********************Statistics************************");
		System.out.println("--------------------No Of Employees In Each Dept----------------");

		TreeMap<String, Integer> duplicates = new TreeMap<String, Integer>();
		 
	      for (Object o : map.keySet()) {
	    	  String dept=map.get(o).getDepartment();
	    	  
	    	  
	    	  
	         if (duplicates.containsKey(dept)) {
	            duplicates.put(dept, duplicates.get(dept) + 1);
	         } else {
	            duplicates.put(dept, 1);
	         }
	      }
    	  System.out.format("Department \t No.of Employees \n");

	      for (Entry<String, Integer> entry : duplicates.entrySet()) {
	  		System.out.format("%s \t \t %d \n", entry.getKey(), entry.getValue());
	      }
			/*System.out.println("--------------------No Of Employees In Each Dept----------------");

			TreeMap<String, ArrayList<Employees>> duplicates = new TreeMap<String, ArrayList<Employees>>();
			 
		      for (Object o : map.keySet()) {
		    	  String dept=map.get(o).getDepartment();
		    	  //String name=map.get(o).getEmpName();
		    	  
		    	  
		    	  
		         if (duplicates.containsKey(dept)) {
		             duplicates.put(dept, null);
		         } else {
		        	 ArrayList<Employees> names=new ArrayList<Employees>();
		        	 duplicates.put(dept, names);

		         }
		      }
	    	  System.out.format("Department \t No.of Employees \n");

		      for (Entry<String, ArrayList<Employees>> entry : duplicates.entrySet()) {
		  		System.out.format("%s \t \t %d \n", entry.getKey(), entry.getValue());
		      }*/
			
			System.out.println("--------------------------------------------------------");

		      System.out.println("Employees whose salary is grater than 50000");
		      System.out.format(" \t Employee Names \n");

		      	for(Object o:map.keySet()) {
		      		if(map.get(o).getSalary()>50000) {
		      			
		      			System.out.format(" \t %s \n",map.get(o).getEmpName());
		      		}
		      	}
				System.out.println("--------------------Highest Salary----------------");
				
				TreeSet <Double> salary= new  TreeSet<Double>();
				 
			      for (Object o : map.keySet()) {
			    	 double sal=map.get(o).getSalary();
			    	  salary.add(sal);
			      }
			      System.out.println("Highest Salary is:"+salary.last());
					System.out.println("--------------------Lowest Salary----------------");
					System.out.println("Lowest Salary is:"+salary.first());

			      
			    	  
		      	
		 }
		
	}
	
	



