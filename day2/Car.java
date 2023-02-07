package week1.day2;

public class Car {
			public int getRegNum()
		{
			int regNo=1832;
			return regNo;
		}
		private String getOwnerName()
		{
			String name="Karthik";
			return name;
		}
		void carModel()
		{
			System.out.println("Safari");
		}
		public boolean isPunctured()
		{
			boolean punctured=false;
			return punctured;
		}
		public float subtractTwoNumbers(float num1,float num2)
		{
			return num1-num2;
		}
		public int multiplyThreeNumbers(int num3,int num4,int num5)
		{
			return num3*num4*num5;
		}
		public int divideTwoNumbers(int num6,int num7)
		{
			return num6/num7;
		}
		public static void main(String[] args) {
			Car c=new Car();
			System.out.println("Car Details");
			int regNo=c.getRegNum();
			System.out.println("Register Number:"+regNo);
			String ownerName = c.getOwnerName();
			System.out.println("Owner Name:"+ownerName);
			c.carModel();
			boolean punctured = c.isPunctured();
			System.out.println("Punctured:"+punctured);
			System.out.println("Operation on Numbers");
			float subtract = c.subtractTwoNumbers(4.5F, 2.5F);
			System.out.println("Subtraction:"+subtract);
			int multiplication = c.multiplyThreeNumbers(5, 4, 1);
			System.out.println("Multiplication:"+multiplication);
			int division=c.divideTwoNumbers(10, 5);
			System.out.println("Division:"+division);
		}
	}


