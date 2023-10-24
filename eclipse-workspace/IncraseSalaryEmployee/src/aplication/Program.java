package aplication;

import java.util.Locale;

import java.util.Scanner;

import entities.*;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println("Employee :" + employee);
		System.out.println();
		
		System.out.println("Wich percent to incresy salary? ");
		employee.percentage = sc.nextDouble();
		employee.incraseSalary(employee.percentage);
				
		System.out.print("Update data: " + employee);
		
		sc.close();		
		
	}

}
