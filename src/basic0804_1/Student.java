package basic0804_1;

public class Student {

	protected String name="";
	protected int number=0;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getNumber() {
		return this.number;
	}

	void setNumber(int number) {
		this.number = number;
	}

	Student(String name, int number){
		this.setName(name);
		this.setNumber(number);
	}
	
	Student(){}
	
	@Override
	public String toString() {

		String str = "";
		str = "이름 : " + getName() + "\n학번 : " + getNumber();
		return str + "\n";

	}

	public boolean equals(Student other) {
		return (this.name.equals(other.name)) && (this.number == other.number);
	}

}
