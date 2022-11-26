package in.co.rays.ExceptionHanding;

public class Exception2 {
	public static void main(String []args) {
		String name = "vijay";
		try {
			System.out.println("Length of name is"+name.length());
			System.out.println("Charter at 7 position is"+name.charAt(6));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("String abhi choti he!!");
		}finally {
			System.out.println("pandit hu me");
		}
	}

}
