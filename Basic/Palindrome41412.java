package in.co.rays.Basic;

public class Palindrome41412 {
	public static void main(String []args) {
	int n = 121,s=0,r,c = 121;
	
	while(n>0) {
		r=n%10;
		
		s=(s*10)+r;
		n=n/10;
	}
	if(c==s)
		System.out.println("palindrome number");
	else
		System.out.println("not palindrome number");
		 

	}



		
}
		



		
	



