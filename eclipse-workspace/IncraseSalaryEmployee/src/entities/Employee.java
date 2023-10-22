package entities;

public class Employee {
	
	public String name = "João Silva";
	public double grossSalary = 6000.00;
	public double tax = 1000.00;
	public double percentage;
	
	public double netSalary() {
		return this.grossSalary - this.tax;		
	}
	
	public void incraseSalary(double percentage) {
		this.grossSalary += (this.grossSalary * this.percentage);
	}
	
	public String toString() {
		return "Name = "
				+ name
				+ String.format("%n")
				+ "Gross Salary = "
				+ grossSalary
				+ String.format("%n")
				+ "Tax = "
				+ tax
	}

}
