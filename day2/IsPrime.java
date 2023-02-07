package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		int n=105; String output=""; 
		for(int i=2;i<n;i++)
		{
			if(n%i == 0)
			{
				output = " is not a Prime Number";
				i=n;
			}
		}
		if (output == "")
		{
			output = " is a Prime Number";			
		}
		System.out.println(n+output);		
		} 
	}
