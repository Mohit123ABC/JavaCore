package in.co.rays.OOP;

public class TestConsA2 {
	public static void main(String []args) {
		ConsA2 c1 = new ConsA2( "kundan","Hanumantiya","12/2/2022");
		String fn = c1.getName();
		System.out.println(fn);
		String fm = c1.getAddress();
		System.out.println(fm);
		System.out.println(c1.getDob());
	}

}
