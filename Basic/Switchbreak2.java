package in.co.rays.Basic;

public class Switchbreak2 {
	public static void main(String [] args) {
		char op='/';
		int a=10;
		int b=2;
	
		switch(op) {
		case '+':
			 
			int d=a+b;
			
			System.out.println(d);
			break;
		case '*':
			int e=a*b;
			System.out.println(e);
			break;
		case '-':
			int k=a-b;
			System.out.println(k);
			break;
		case '/':
			int f=b/a;
			if(a>b) {
			System.out.println(f);
			}else {
				System.out.println(f);
			}
			
		}
	}

}
