package in.co.rays.Practice;

public class TestClass {
	public static void main(String []args) {
		CircleEx c = new CircleEx();
		
		SuperClassInheri s  = new CircleEx();
		c.setRadius(4);
		double d = c.area();
		System.out.println(+c.getRadius());
		System.out.println(d);
	}

}
