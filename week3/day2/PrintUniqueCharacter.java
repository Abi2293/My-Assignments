package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String name="abirami";
		int k;
		Set<Character> nameset=new HashSet<Character>();
		char[] nameArray = name.toCharArray();
		//System.out.println("Array Length"+nameArray.length);
		for(k=0;k<nameArray.length;k++)
		{
			//System.out.println(nameArray[k]);
			nameset.add(nameArray[k]);
		}
		System.out.println("Given Name:"+name);
		System.out.println("Unique Character in the give name:"+nameset);
	}
}
