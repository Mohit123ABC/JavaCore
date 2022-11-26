package in.co.rays.ExceptionHanding;

public class Question4 {
	public static void main(String []args) {
		int fact = 1;
		try {
			for(int i=5; i>0; i--) {
				fact = fact*i;
			}
			System.out.println(fact);
		}finally {
			System.out.println("ooook!!!");
		}
	}

}
