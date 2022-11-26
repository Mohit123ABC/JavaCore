package in.co.rays.Inheritance;

public class CircleEx extends ParentExInheri {
	
	public double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double area() {
	     return 3.14*radius*radius;
	}

}
