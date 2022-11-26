package in.co.rays.OOP;

public class ConsA2 {
	private String name;
	private String address;
	private String dob;
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getDob() {
		return dob;
	}
	//parameterized constructer
	public ConsA2(String name,String address,String dob) {
		this.name = name;
		this.address = address;
		this.dob = dob;
		
	}
	//Default constructer
	public ConsA2() {
		super();
	}
	

}
