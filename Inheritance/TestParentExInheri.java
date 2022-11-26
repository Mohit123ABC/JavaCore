package in.co.rays.Inheritance;

public class TestParentExInheri {
	public static void main(String []args) {
		
		CircleEx c = new CircleEx();
		TriangleEx t = new TriangleEx();
		RactangleEx r = new RactangleEx();
		
		//parent class can keep referance of child class
		ParentExInheri s = new CircleEx();
		
		c.setRadius(3);
		
		double d = c.area();
		
		System.out.println("Radius of circle:"+c.getRadius());
		System.out.println("Area of circle:"+d);
		
		r.setLength(12);
		r.setWidth(10);
		double d1 = r.area();
		
		System.out.println("Length of rectengle is:"+r.getLength());
		System.out.println(r.getWidth());
		System.out.println(d1);
		
		t.setBase(5);
		t.setHeight(3);
		double d2 = t.area();
		
		System.out.println(t.getBase());
		System.out.println(t.getHeight());
		System.out.println(d2);
	}

}
