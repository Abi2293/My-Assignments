package week3.day1;


public class ReverseEvenWords {
	public static void main(String[] args) {
		String s="I am a software tester",o="",finalstring="";
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			//System.out.println("Length"+str.length);
			//System.out.println(i+":"+str[i]);
			//System.out.println(i+":"+i%2);
			if(i%2==0)
			{
				System.out.print(str[i]+" ");
			}
			else
			{
				char[] charArray = str[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--) 
				{
					//System.out.print(charArray[j]);
					o=o+charArray[j];
				}
				System.out.print(o+" ");
			}
			//System.out.println(str[i]+o);
		}
		
	}
}
