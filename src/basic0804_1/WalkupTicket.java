package basic0804_1;

public class WalkupTicket extends Ticket{

	private boolean payByCredit;
	boolean getPayByCredit() {
		return this.payByCredit;
	}
	
	void setPrice(int price) {
		super.price = price;
	}
	WalkupTicket(){}
	WalkupTicket(int number, boolean payByCredit){
		super(number);
		this.payByCredit = payByCredit;
	}
	public String toString() {
		String str;
		str = this.getNumber() + "" + this.getPayByCredit() + super.getPrice();
		return str;
	}
	
}
