package basic0804_1;

public class Ticket {

	protected int number;
	protected double price = 0;
	
	int getNumber() {
		return this.number;
	}
	double getPrice() {
		return this.price;
	}
	
	Ticket(){}
	Ticket(int number){
		this.number = number;
	}
	
	public String toString() {
		String str = "";
		str = "번호 : " + number + ",가격 : " + price;
		return str + "\n";
	}
	
	
	
	
}
