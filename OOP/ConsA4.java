package in.co.rays.OOP;

public class ConsA4 {
	private String color;
	private String speed;
	private int gear;
	private String make;
	
	public String color() {
		return color;
	}
	public String speed() {
		return speed;
	}
	public int gear() {
		return gear;
	}
	public String make() {
		return make;
	}
	//parameterized constructer
	public ConsA4(String color,String speed,int gear,String make) {
		this.color = color;
		this.speed = speed;
		this.gear = gear;
		this.make = make;
	}
	//default constructer
	public ConsA4() {
		super();
	}
	
	
	
	
	

}
