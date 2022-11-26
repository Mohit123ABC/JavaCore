package in.co.rays.polymorphism;

public class Exercise973person {
	
	private String firstName;
	private String lastName;
	
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	
	//paremeterezed constuctor
	public Exercise973person(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	//Default constructor
	public Exercise973person() {
		super();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
