package in.co.rays.Basic;

public class Exercise414Armstrong {
	public static void main(String [] args) {
		 int num = 371,num1 = 371, check = 0;
		 while(num!=0) {
			 int digit = num%10;
			 check = digit*digit*digit+check;
			 num=num/10;
		 }
		 if(check==num1)
		System.out.println("num is armstrong");
		 else
			 System.out.println("num is not armstrong");
	}

}
