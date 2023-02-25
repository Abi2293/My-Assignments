package week3.day1;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1",finalstring="";
		System.out.println("Given String:"+text);
		String textArray[]=text.split(" ");
		int count=1,i,j;
		int length=textArray.length;
		boolean condition;
		//System.out.println("Length:"+length);
		for(i=0;i<length;i++)
		{
			//System.out.println("i "+i+" "+textArray[i]);
			for(j=i+1;j<length;j++)
			{
				//System.out.println("j "+j+" "+textArray[j]);
				condition=textArray[i].equals(textArray[j]);
				//System.out.println("Condition"+condition);
				if(condition==true)
				{
					System.out.println(textArray[i]+" "+textArray[j]);
					count++;
					System.out.println(count);
				}
			}
			count=1;
		}	
	}
}
