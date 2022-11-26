package in.co.rays.Loop;

public class String1 {
	public static void main(String [] args) {
		String s = "Vijay Dinanath chouhan";
		System.out.println(s.length());
		System.out.println(s.charAt(8));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(".........................");
		
		//String literal pool
		String S1 = "Ram";
		String S2 = "Ram";
		boolean result = (S1==S2);
		System.out.println(result);
		boolean result3 = (S1.equals(S2));
		System.out.println(result3);
		System.out.println("......................");
		
		//Heap memory
		String S3 = new String("Ram");
		String S4 = new String("Ram");
		
		//check referance
		boolean result1 = (S3==S4);
		System.out.println(result1);
		
		//checks value
		boolean result2 = (S3.equals(S4));
		System.out.println(result2); 
	 
		
		
		
	}

}
