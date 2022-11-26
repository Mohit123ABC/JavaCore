package in.co.rays.polymorphism;

public class MethodOverloding {
	//complie time polymorphism or static binding
	public static void main(String []args) {
		
	    display(1);
		display(1,2);
		display("hey","hello","Hii");
	}


		
	
	private static void display(int s) {
		System.out.println("Argument:"+s);
	}
	private static void display(int i,int j) {
	System.out.println("Argument:"+i+ "&" +j);
	}
	private static void display(String s,String t,String u) {
		System.out.println("Argument:"+s+","+t+","+u);
	}


	

}
