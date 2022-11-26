package in.co.rays.Basic;

public class Exercise4141 {
	public static void main(String[] args) {
		int a=30;
		int b=20;
		if(a>b) {
			System.out.println("a is greter");
		}else if(a==b) {
			System.out.println("both or equal");
		}else {
			System.out.println("b is greter");
		}
		
		//Q2
		int c=20;
		int d=24;
		if(c>d) {
			System.out.println("c is greter");
		}else if (c==d){
			System.out.println("both or equal");
		}else {
			System.out.println("d is smaller");
		}
		
		//Q3
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		//Q4
		int fact=1;
		for(int i=5; i>0; i--) {
			fact=fact*i;
		}
			System.out.println(fact);
		
		
		//Q9
		for(int i=1; i<=4; i++) {
			
		
			for(int j=1; j<=i; j++) {
				
		System.out.print(" "+i);
			}
			System.out.println("");
		}
		
		//Q5
		int n=123,r;
		while(n>0) {
			
			r = n%10;
			
			System.out.print( r );
			
			n = n/10;
		}
		
		
		
		
				
	}

}