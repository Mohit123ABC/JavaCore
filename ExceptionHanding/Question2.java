package in.co.rays.ExceptionHanding;

public class Question2 {
	public static void main(String []args) {
		int a =12,b =24;
		try {
			if(a>b) {
				System.out.println("a is greater");
			}else if(a==b) {
				System.out.println("both or equal");
			}else {
				System.out.println("b is smaller");
			}
		}finally {
				System.out.println("ok!!");
			}
		
	}

}
