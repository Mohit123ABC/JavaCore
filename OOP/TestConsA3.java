package in.co.rays.OOP;

public class TestConsA3 {
	public static void main(String []args) {
		ConsA3 a = new ConsA3("324254","saving",10000);
		a.fundTransfer(1000);
		a.deposit(20000);
		a.withdrowl(200);
		System.out.println("Nuber"+a.getNumber());
		System.out.println("Accounttype"+a.getAccounttype());
		System.out.println("Balance"+a.getBalance());
	}

}
