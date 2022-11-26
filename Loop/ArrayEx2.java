package in.co.rays.Loop;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] CopyFrom = {1,2,3,4,5};
		int[] CopyTo = new int[5];
		
		for(int i : CopyFrom) {
		
		System.out.println(i);
		
		}

	
			
	
	
		for(int j : CopyTo) {
			
			System.out.println(j);
		
		System.arraycopy(CopyFrom,2,CopyTo,0,3);
		}
}
}