package week3.day1;

public class ReverseString {
	public static void main(String[] args) {
		String s="TestLeaf";
		System.out.println("Given String:"+s);
		System.out.print("Reversed String:");
		char[] c = s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
	}

}
