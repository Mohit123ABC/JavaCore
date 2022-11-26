package in.co.rays.Loop;

public class TestSum {
	public static void main(String []args) {
		int n = 2;
		int m = 2;
		TestSum s = new TestSum();  //creting obj of method class
		int value = s.Sum(m,n);     //funtion/method calling
		System.out.println(value);
	}
	
	//Instance method are which require an obj of  its class to be
	//created before of it can be called
    public  int Sum(int a,int b) {
    	return a+b;
    }
}
