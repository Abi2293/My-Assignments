package week3.day1;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String name="testleaf";
		char[] charArray = name.toCharArray();
		System.out.println("Original String:"+name);
		System.out.print("Odd Index character in Upper case:");
		for(int i=0;i<charArray.length;i++)
		{
			if(i%2!=0)
			{
				charArray[i]=Character.toUpperCase(charArray[i]);
			}
			System.out.print(charArray[i]);
		}
	}
}
