package in.co.rays.OOP;

public class TestConsA4 {
	public static void main(String []args) {
		ConsA4 a = new ConsA4("Red","70",'5',"make");
		String fn = a.color();
		System.out.println(fn);
		System.out.println(a.speed());
		System.out.println(a.gear());
		System.out.println(a.make());
	}

}
