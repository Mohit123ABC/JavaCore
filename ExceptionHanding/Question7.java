package in.co.rays.ExceptionHanding;

public class Question7 {
	public static void main(String []args) {
		int sum = 0;
	try {
		for(int i=100; i<=200; i++) {
		if(i%7==0) {
			sum=sum+i;
		}	
		}
		System.out.println("sum="+sum);
		
	}finally {
		System.out.println("finally");
	}
	}

}
