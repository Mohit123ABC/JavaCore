package in.co.rays.Basic;

public class Logicaloperaters2 {
	public static void main(String [] args) {
		int a=10, b=20, c=20;
		if(a<b && b==c) {
			int d= a+b+c;
			System.out.println("The sum is:" +d);
		}else {
			System.out.println("false condition");
		}
	}

}
