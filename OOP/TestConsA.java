package in.co.rays.OOP;

public class TestConsA {
	
	public static void main(String []args) {
		ConsA c1 = new ConsA("mohit","gayke",2);
		String fn = c1.getFname();
		System.out.println(fn);
		String fm = c1.getLname();
		System.out.println(fm);
		int fl = c1.getId();
		System.out.println(fl);
		
	}

}
