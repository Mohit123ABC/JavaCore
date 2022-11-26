package in.co.rays.Inheritance;

public class ParentExInheri {
	
	private String color;
	private int bw;
	private int side;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getBw() {
		return bw;
	}
	public void setBw(int bw) {
		this.bw = bw;
	}
	
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	
	//Default constructor
	public ParentExInheri() {
		super();
		System.out.println("Inside Default constractor");
	}
	
	//parameterized constructor
	public ParentExInheri(String color,int bw,int side) {
		
		this.color = color;
		this.bw =bw;
		this.side = side;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
