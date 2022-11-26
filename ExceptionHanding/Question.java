package in.co.rays.ExceptionHanding;

public class Question {
	public static void main(String []args) {
		
		try {
			for(int i=1; i<=5; i++) {
				System.out.println(i);
			}
		}finally {
			System.out.println("Mohit");
		}
	}

}
