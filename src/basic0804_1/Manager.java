package basic0804_1;

public class Manager extends Employee {

	protected double bonus = 0;
	double getBonus() {return this.bonus;}
	Manager(){}
	Manager(String name, double salary, double bonus){
		super(name,salary);
		this.bonus = bonus;
	}

	public void raiseSalary() {
		salary *= 1.2;
	}
	
	
}
