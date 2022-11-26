package in.co.rays.polymorphism;

public class Question1Main {
	public static void main(String []args) {
		double Totalarea = 0.0;
		Question1Circle m = new Question1Circle();
		m.setRadius(3.4);
		
		double radius = m.getRadius();
		System.out.println("Radius of Circle is:"+radius);
		
		double Circlearea = m.area();
		System.out.println("Area of Circle is:"+Circlearea);
		
		Question1Triangle t = new Question1Triangle();
		t.setHeight(30);
		t.setLength(20);
		
		double height = t.getHeigth();
		System.out.println("height of Triangle:"+height);
		
		double length = t.getLength();
		System.out.println("length of Triangle is:"+length);
		
		double Trianglearea = t.area();
		System.out.println("Area of Triangle is:"+Trianglearea);
		
		Quetion1Rectangle s = new Quetion1Rectangle();
		s.setLength(12);
		s.setWidth(34);
		
		double length1 = s.getLength();
		System.out.println("length of Rectangle is:"+length1);
		
		double width = s.getWidth();
		System.out.println("width of Rectangle is:"+width);
		
		double Rectanglearea = s.area();
		System.out.println("Area of Rectangle is:"+Rectanglearea);
	}

}
