package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		Set<Integer> dataset = new TreeSet<Integer>();
		List<Integer> datalist=new ArrayList<Integer>();
		for(int i=0;i<data.length;i++)
		{
			dataset.add(data[i]);
		}
		System.out.println("Dataset:"+dataset);
		datalist.addAll(dataset);
		System.out.println("Datalist"+datalist);
		System.out.println("Second Last Element:"+datalist.get(datalist.size()-2));
	}
}
