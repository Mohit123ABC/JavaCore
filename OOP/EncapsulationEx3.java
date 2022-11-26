package in.co.rays.OOP;

public class EncapsulationEx3 {
	private String number;
	private String type;
	private double balance;
	
	//getter method return
	public String getNumber() {
		return number;
	}
	public void SetNumber(String number) {
		this.number = number;
	}
	
	public String getType() {
		return type;
	}
	public void SetType(String type) {
		this.type = type;
	}
	
	
	public double getBalance() {
		return balance;
	}
	public void SetBalance(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double balance) {
		this.balance = this.balance+balance;
		return this.balance;
	}
	
	public double withdraw(double withdraw) {
		this.balance = balance-withdraw;
		return this.balance;
	}
	
	public void fundTransfer( String account,double amount) {
		System.out.println("your account number is:"+account);
		System.out.println("your amount is:"+amount);
	}
	
	


	






	
	

}
