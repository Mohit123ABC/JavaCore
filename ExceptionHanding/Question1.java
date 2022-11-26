package in.co.rays.ExceptionHanding;

public class Question1 {
	public static void main(String []args) {
		int a = 40;
		int b = 30;
		try { 
			if(a>b) {
				System.out.println("a is greater");
				
			}else if(a==b) {
				System.out.println("both or equal");
			}else {
				System.out.println("b is greter");
			}
			}finally{
				System.out.println("finally block");
			}
			
			
		
	}

}
