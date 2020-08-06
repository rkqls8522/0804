package basic0804_1;

public class AdvanceTicket extends Ticket{

	private int advancedays;
	
	int getAdvancedays() {
		return this.advancedays;
	}
	
	AdvanceTicket(){}
	AdvanceTicket(int number, int advancedays){
		super(number);
		this.advancedays = advancedays;
	}
	double getPrice() {
		if(advancedays >= 30)
			return price*0.5;
		else if(advancedays >=10)
			return price*0.8;
		else if(advancedays >= 5)
			return price*0.9;
		else
			return price;
	}
	
	public String toString() {
		String str;
		str = "��ȣ : " + this.number + "\n���������ϼ� : " + this.getAdvancedays() + "\n���� : " + this.getPrice();
		return str;
	}
	
	
}
