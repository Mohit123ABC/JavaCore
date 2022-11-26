package in.co.rays.OOP;

public class ConsA {
	private String Fname;
	private String Lname;
	private int Id;
	
	public String getFname() {
		return Fname;
	}
	public String getLname() {
		return Lname;
	}
	public int getId() {
		return Id;
	}
	//paramiterize constucter
	
	public ConsA(String fname,String lname,int id) {
		
		this.Fname = fname;
		this.Lname = lname;
		this.Id = id;
	}
		//Default Constructer
		public ConsA() {
			super();
		
	}
	

}
