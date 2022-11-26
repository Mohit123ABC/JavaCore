package in.co.rays.polymorphism;

public class Quetion1Rectangle extends Exercise971Shape {
	@Override
	public double area() {
		// TODO Auto-generated method stub
		double area = length*width;
		return area;
	}
	public double length;
	public double width;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

}
