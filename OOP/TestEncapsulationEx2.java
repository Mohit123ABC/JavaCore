package in.co.rays.OOP;

public class TestEncapsulationEx2 {
	public static void main(String []args) {
		EncapsulationEx2 mn =  new EncapsulationEx2();
		mn.SetName("sohan");
		mn.SetAddress("Khargone");
		mn.SetDob("11/5/2022");
		
		String name = mn.getName();
		System.out.println(name);
		String address = mn.getAddress();
		System.out.println(address);
		String dob = mn.getDob();
		System.out.println("Date of birth:" +dob);
	}

}
