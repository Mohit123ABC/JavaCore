package in.co.rays.polymorphism;

public class Question1Triangle extends Exercise971Shape {
	public double length;
	public double height;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeigth() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		double area = 0.5*length*height;
		return area;
	}

}
