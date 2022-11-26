package in.co.rays.Abstract;

public class Department implements Cloneable {
	
	public String employee1;
	public String employee2;
	Employee e = null;
	public Department(String em1,String em2) {
		employee1 = em1;
		employee2 = em2;
		e=new Employee("USA","UK");
	}
	public Object clone()throws CloneNotSupportedException{
		Department c =(Department)super.clone();
		c.e=(Employee) e.clone();
		  return c;
	}
	public static void main(String []args)throws CloneNotSupportedException {
		
		Department c1 = new Department("mohit","sohan");
		Department c2 = (Department)c1.clone();
		
		System.out.println(c2.employee1);
		System.out.println(c2.employee2);
		System.out.println(c2.e.LocalAddress);
		System.out.println(c2.e.PermanentAddress);
	}

}
