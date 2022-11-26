package in.co.rays.Practice;

public class TestEncapsulationEx {
	public static void main(String []args) {
		EncapsulationEx m = new EncapsulationEx();
		m.setN(23);
		m.setB(24);
		m.setC(12);
		
		int n = m.getN();
		System.out.println(n);
		
		int b  = m.getB();
		System.out.println(b);
		
		int c = m.getC();
			System.out.println(c);
		
	}

}
