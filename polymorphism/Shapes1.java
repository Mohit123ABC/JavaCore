package in.co.rays.polymorphism;

public class Shapes1 {
	public void area() {
		System.out.println("find area");
	}
public void area(int r) {
	System.out.println("circle area="+3.14*r*r);
     }
public void area(double b,double h) {
	System.out.println("Triangle area="+0.5*b*h);
	
    }
public void area(int l,int w) {
	System.out.println("Rectangl area="+l*w);
  }
}




