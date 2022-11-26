package in.co.rays.OOP;
import java.util.Date;
public class EncapsulationEx2 {
	
	//Bean class private attributs and public getter/setter method
	private String name;
	private String address;
	private String dob;
	
	public String getName() {
		return name;
	}
	public void SetName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void SetAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void SetDob(String dob) {
		this.dob = dob;
	}

}
