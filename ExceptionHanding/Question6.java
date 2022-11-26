package in.co.rays.ExceptionHanding;

public class Question6 {
	public static void main(String []args) {
		
		int n = 10,firstTerm = 0,SecandTerm = 1;
		try {
			for( int i=1; i<=n; i++) {
				System.out.print(firstTerm+ ",");
				
			int	nestTerm =firstTerm+SecandTerm;
			firstTerm = SecandTerm;
			SecandTerm = nestTerm;
			}
		}finally {
			System.out.println("Okkk!!");
		}
		
	}

}
