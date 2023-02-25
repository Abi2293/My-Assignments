package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1",finalstring="";
		String textarray[]=text.split(" ");
		Set<String> textset=new LinkedHashSet<String>();
		List<String> textlist=new ArrayList<String>();
		for(int i=0;i<textarray.length;i++)
		{
			textset.add(textarray[i]);
		}
		textlist.addAll(textset);
		for(int j=0;j<=textlist.size()-1;j++)
		{
			finalstring=finalstring+textlist.get(j)+" ";
		}
		System.out.println("Given String:"+text);
		System.out.println("On Removing Duplicate Words:"+finalstring);
	}
}
