package in.co.rays.ExceptionHanding;

public class Exception4 {
	public static void main(String []args) {
		String name = "mohit";
		try {
			System.out.println("Length of name is"+name.length());
			System.out.println("charter of name is"+name.charAt(6));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("String abhi baki he");
		}catch(NullPointerException e) {
			System.out.println("sundar sa name nhi he!");
		}finally {
			System.out.println("pandit hu me");
		}
	}

}
