package in.co.rays.ExceptionHanding;

public class Question9 {
	public static void main(String []args) {
		try {
			for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print(" "+i);	
			}
			System.out.println("");
			}
		}finally {
			System.out.println("finally!!!");
		}
	}

}
