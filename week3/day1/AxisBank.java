package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("Recurring Deposit Interest of Axis Bank is 6.75");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.saving();
		a.fixed();
		a.deposit();
	}
}
