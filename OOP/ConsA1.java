package in.co.rays.OOP;

public class ConsA1 {
	private String Name;
	private String Address;
	private int Id;
	
	public String getName() {
		return Name;
	}
	public String getAddress() {
		return Address;
	}
	public int getId() {
		return Id;
	}
	//paramiterized constructer
	public ConsA1(String name,String address,int id) {
		this.Name = name;
		this.Address = address;
		this.Id = id;
	}
	

}
