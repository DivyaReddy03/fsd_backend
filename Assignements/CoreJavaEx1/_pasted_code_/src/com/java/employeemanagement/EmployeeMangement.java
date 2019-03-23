package com.java.employeemanagement;

import java.util.Scanner;

public class EmployeeMangement {

	static Scanner sc=new Scanner(System.in);	
	static int op;
	static char choice;
	static boolean flag;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService es=new EmployeeService();
		
			while(flag==false)
			{
				
				try {
					do {
						System.out.println("Choose an action: ");
						System.out.println("1. add Employee");
						System.out.println("2. update Employee");
						System.out.println("3. View Employee by id");
						System.out.println("4. View All Employees");
						System.out.println("5.Delete Employee");
						System.out.println("6. Statistics");
					op=sc.nextInt();
					flag=true;
					switch(op)
					{
					case 1: es.addEmployee();
							break;
					case 2: System.out.println("Enter employee id:");
							es.updateEmployee(sc.nextInt());
							break;
					case 3: System.out.println("Enter employee id:");
							es.viewEmployeeById(sc.nextInt());
							break;
					case 4:	es.viewEmployees();
							break;
					case 5: System.out.println("Enter employee id:");
							es.deleteEmployee(sc.nextInt());
							break;
					case 6: es.statistics();
							break;
					
					default:System.out.println("choose valid action");
					}
					System.out.println("Do you want to continue Y/N :");
					choice=sc.next().charAt(0);
					
					}
					while(choice=='Y'||choice=='y');
				}catch(Exception e) {
					flag=false;
					System.out.println(e.toString());
					System.out.println("Enter a valid option");
					
				
				}
				
			}
			
			
		
		
	}

}
