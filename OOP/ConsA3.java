package in.co.rays.OOP;

public class ConsA3 {
	private String number;
	private String accounttype;
	private double balance;
	
	public ConsA3(String number,String accounttype,double balance){
		this.number = number;
		this.accounttype = accounttype;
		this.balance = balance;
	}
	public ConsA3() {
		System.out.println("Default constructor");
	}
		
	public String getNumber() {
		return number;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance = balance+amount;
	}
	public void withdrowl(double amount) {
		balance = balance-amount;
	}
	public void fundTransfer(double amount) {
		balance = balance-amount;
	}
	
	

}
