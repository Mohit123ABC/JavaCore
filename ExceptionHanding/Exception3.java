package in.co.rays.ExceptionHanding;

public class Exception3 {
	public static void main(String []args) {
		String name = null;
		try {
			System.out.println("Length of name is"+name.length());
			System.out.println("charter at 7th position"+name.charAt(6));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("string abhi baki he");
		}catch(NullPointerException e) {
			System.out.println("sundfar sa name nhi he");
		}finally {
			System.out.println("pandit hu me");
		}
	}

}
