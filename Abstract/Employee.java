package in.co.rays.Abstract;

public class Employee implements Cloneable{

	public String PermanentAddress;
	public String LocalAddress;
	
	public Employee(String local,String Permanent) {
		this.LocalAddress = local;
		this.PermanentAddress = Permanent;
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	
}
