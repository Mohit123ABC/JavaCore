package in.co.rays.Basic;

public class Exercise414 {
	public static void main(String [] args) {
		
		//Q6
		int n = 10, firstTerm =0, secondTerm =1;
	//	System.out.println("Fibonacci series till" + n + "terms");
		
		for(int i=1; i<=n; i++) {
			System.out.print(firstTerm+",");
		
		//copute the next term
		int nextTerm=firstTerm+secondTerm;
		firstTerm=secondTerm;
		secondTerm=nextTerm;
		
		}	
		
	}

}
