package in.co.rays.Basic;

public class Loop {
	public static void main(String [] args) {
	//	for( int i=0; i<=5; i++) {
	//		System.out.println("Hello" +i);
	//	}
		
		//reverse for loop
	//	for(int i=5; i>0; i--) {
	//		System.out.println("Hello=" +i);
	//	}
		
		//pre increment
	//	for(int i=0; i<=10; ++i) {
	//		System.out.println(i);
	//	}
		//pre decrement
	//	for(int i=5; i>0; --i) {
	//		System.out.println(i);
	//	}
		
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++)
			System.out.print(i);
			
			System.out.println();
			
		}
		
	}

}
