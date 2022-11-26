package in.co.rays.polymorphism;

public class MainEx {
	public static void main(String []args) {
		Shapes a = new Shapes();
		Shapes s = new Triangle();
		Shapes d = new Circle();
		a.area();
		s.area();
		d.area(); 
	}

}
