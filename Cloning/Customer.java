package in.co.rays.Cloning;

public class Customer implements Cloneable {
	
	//deep cloning uses two classes customer and BankAccount
	
	public String name = null;
	public BankAccount account = null;
	
	public Customer(String n) {
		
		name = n;
		account = new BankAccount(5400);
	}
	public Object clone()throws CloneNotSupportedException{
      Customer c =(Customer) super.clone();
      c.account = (BankAccount) account.clone();
      return c;
	}
		
	public static void main(String []args) throws CloneNotSupportedException{
		
		Customer c1 = new Customer("ABC");
		Customer c2 = (Customer)c1.clone();
		
		System.out.println(c2.name);
		System.out.println(c2.account.balance);
		
		c2.name = "XYZ";
		c2.account.balance = 65000;
		
		//Original
		System.out.println("Name:"+c1.name);
		System.out.println("Balance:"+c1.account.balance);
		
		//After cloning
		System.out.println("Name:"+c2.name);
		System.out.println("Balance:"+c2.account.balance);
		
	}


}
