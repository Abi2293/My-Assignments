package week3.day1;

public class Suzuki extends Bike {
	public void tyre()
	{
		System.out.println("Use MRF Tyres");
	}
	public static void main(String[] args) {
		Suzuki s=new Suzuki();
		s.applyBrakes();
		s.seat();
		s.tyre();
	}
}
