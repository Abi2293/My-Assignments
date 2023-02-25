package week3.day1;

public class AshokLeyland extends Truck {
	public void year()
	{
		System.out.println("2023 Make");
	}
	public static void main(String[] args) {
		AshokLeyland al=new AshokLeyland();
		al.applyBrakes();
		al.truckType();
		al.year();				
	}
}
