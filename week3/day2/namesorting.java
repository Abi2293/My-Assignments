package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class namesorting {
	public static void main(String[] args) {
		String names[]= {"HCL","Wipro","Aspire Systems","CTS"};
		System.out.println("Using Array Sort Method");
		Arrays.sort(names);
		for(int i=names.length-1;i>=0;i--)
		{
			System.out.println(names[i]);
		}
		System.out.println("\nUsing Collections");
		Set<String> nameset=new LinkedHashSet<String>();
		for(int j=names.length-1;j>=0;j--)
		{
			nameset.add(names[j]);
		}
		System.out.println(nameset);
	}
}
