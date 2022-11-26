package in.co.rays.OOP;

public class TestEncapsulationEx3 {
	public static void main(String []args) {
		EncapsulationEx3 bn = new EncapsulationEx3();
		bn.SetNumber("235556234556");
		bn.SetType("saving");
		bn.SetBalance(10000);
		
		String account = bn.getNumber();
		System.out.println("your account number:"+account);
		
		String Type = bn.getType();
		System.out.println("your acc type is:"+Type);
		
		double balance = bn.getBalance();
		System.out.println("your balance:"+balance);
		
		double diposit = bn.deposit(200);
		System.out.println("your balance after diposit:"+diposit);
		
		double withdraw = bn.withdraw(100);
		System.out.println("your balance after withdraw:"+withdraw);
		
		bn.fundTransfer("120201202",withdraw);

	}

}
		
	


