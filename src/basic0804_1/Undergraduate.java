package basic0804_1;

public class Undergraduate extends Student {

	protected String clubName="";

	String getClubName() {
		return this.clubName;
	}

	void setClubName(String name) {
		clubName = name;
	}

	protected int number=0;

	int getNumber() {
		return this.number;
	}

	void setNumber(int number) {
		this.number = number;
	}

	protected String name="";

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	Undergraduate() {
		super();
		clubName = "";
	}

	Undergraduate(String name, int number, String clubName) {
		super(name, number);
		this.setClubName(clubName);
		this.setName(name);
		this.setNumber(number);


	}

	boolean equals(Undergraduate other) {
		return (super.equals(other)) && (this.clubName.equals(other.clubName));
	}

	public String toString() {
		String str;
		str = super.toString() + "\n동아리 이름 : " + this.getClubName() + "\n이름 : " + this.getName() + "\n번호 : "
				+ this.getNumber();
		return str + "\n";
	}

}
