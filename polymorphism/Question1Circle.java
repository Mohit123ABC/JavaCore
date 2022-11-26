package in.co.rays.polymorphism;

public class Question1Circle extends Exercise971Shape {
	public double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		double area =  3.14*radius*radius;
		return area;
	}

}
