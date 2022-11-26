package in.co.rays.OOP;

public class TestEncapsulationEx4 {
	public static void main(String []args) {
		
		//Automobile
		EncapsulationEx4 sn = new EncapsulationEx4();
		sn.SetColor("black");
		sn.SetSpeed(100);
		sn.SetGear(5);
		sn.SetMake("TATA");
		
		String color = sn.getColor();
		System.out.println(color);
		int Speed = sn.getSpeed();
		System.out.println(Speed);
		int Gear = sn.getGear();
		System.out.println(Gear);
		String Make = sn.getMake();
		System.out.println(Make);
	}

}
