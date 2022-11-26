package in.co.rays.Inheritance;

public class TestShapeEx {
	public static void main(String []args) {
		
		BusinessmanEx c = new BusinessmanEx();
		DoctorEx m = new DoctorEx();
		StudentEx n = new StudentEx();
		
		//parent class can keep  referance of child class
		ShapeEx s = new BusinessmanEx();
		
		c.setIncome(10000);

         
		System.out.println("Income:"+c.getIncome());
		
		ShapeEx l = new DoctorEx();
		m.setRegistrationNo("23456");
		System.out.println("RegistrationNo:" + m.getRegistrationNo());
		
		ShapeEx h = new StudentEx();
		n.setMarks(75);
		System.out.println("Marks:"+n.getMarks());
	



	}

}
