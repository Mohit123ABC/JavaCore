package in.co.rays.ExceptionHanding;

public class Question5 {
	public static void main(String []args) {
		int n = 123,r;
		
		try {
		while(n>0) {
			r = n%10;
			System.out.print(r);
			n = n/10;
		}
		}finally {
			System.out.println("\nok!!!");
		}
	}

}
