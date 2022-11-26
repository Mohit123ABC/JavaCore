package in.co.rays.Basic;

public class ReverseNumber4145 {
	public static void main(String []args) {
		int n=123,r;
		while(n>0) {
			r=n%10;
			
			System.out.print(r);
			
			n=n/10;
		}
		
	}

}
