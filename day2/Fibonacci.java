package week1.day2;

public class Fibonacci {
public static void main(String[] args) {
	int num1=0,num2=1,sum=0;
	System.out.println("Fibonacci Series");
	System.out.println(num1);
	for(int i=1;i<11;i++)
	{
		num1=num2;
		num2=sum;
		sum=num1+num2;
		System.out.println(sum);
	}
}
}
