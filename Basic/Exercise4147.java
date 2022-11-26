package in.co.rays.Basic;

public class Exercise4147 {
	public static void main(String [] args) {
		int sum=0;  //,count=0;
		for(int i=100; i<200; i++) {
		
			if(i%7==0) {
				sum =sum+i;
				//count++;
			}
			
		}
		System.out.println("sum=" +sum);
		//System.out.println("sum=" +count);
		
    }
}