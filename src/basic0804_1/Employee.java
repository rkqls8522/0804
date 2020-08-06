package basic0804_1;

public class Employee {

	protected String name="";
	protected double salary = 0;
	
	String getName() {
		return this.name;
	}
	double getSalary() {
		return this.salary;
	}
	
	Employee(){}
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public void raiseSalary() {
		salary *= 1.3;
	}
	
	
	
}
