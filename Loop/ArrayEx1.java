package in.co.rays.Loop;

public class ArrayEx1 {
	
	public static void main(String [] args) {
	
		char[] copyFrom = {'S','U','N','R','A','Y','S'};
		char[] copyTo = new char[4];
		
		System.arraycopy(copyFrom,3,copyTo,0,4);
		System.out.println(copyFrom);
		System.out.println(copyTo);
		
		for(int i=0; i<4; i++) {
			
			System.out.println(args[i]);
			
		}
		for(char C:copyTo) {
			System.out.println(C);
			
		}
		
	}

}
