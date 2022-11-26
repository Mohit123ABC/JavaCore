package in.co.rays.Inheritance;
import java.util.Date;
public class ShapeEx {
	
	private String name;
	private String address;
	private Date dob;
	
	public String getname() {
		return name;
	}
	
	public String getaddress() {
		return address;
	}
	public Date getdob() {
		return dob;
	}

	//Default constructor
	public ShapeEx() {
		super();
	}
	
	//parameterized constructor
	ShapeEx(String name, String address,Date dob){
		
		this.name = name;
		this.address = address;
		this.dob = dob;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
