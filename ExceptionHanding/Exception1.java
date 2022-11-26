package in.co.rays.ExceptionHanding;

public class Exception1 {
	public static void main(String []args) {
		
		int i = 0;
		int j = 50;
		
		try {
			int value = j/i;
			System.out.println(value);
		}catch(Exception e) {
			System.out.println("Divided by Zero");
		//	e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally block");
		}
	}

}
