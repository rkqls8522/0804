package basic0804_1;

public class Executive extends Manager{

	private double stockOption = 0;
	double getStockOption() {
		return this.stockOption;
	}
	Executive(){}
	Executive(String name, double salary, double bonus, double stockOption){
		super(name, salary, bonus);
		this.stockOption = stockOption;
	}

	public void raiseSalary() {
		salary *= 1.1;
	}
	
}
