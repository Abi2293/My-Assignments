package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {
		int data[]= {1,2,3,4,6,4,7,8,9,10,3,2};
		Set<Integer> dataset=new TreeSet<Integer>();
		List<Integer> datalist=new ArrayList<Integer>();
		for(int i=0;i<data.length;i++)
		{
			dataset.add(data[i]);
		}
		System.out.println("Dataset:"+dataset);
		datalist.addAll(dataset);
		//System.out.println("Size:"+datalist.size());
		for(int j=0;j<datalist.size()-1;j++)
		{
			int temp1=datalist.get(j);
			int temp2=datalist.get(j+1);
			if(temp2!=(temp1+1))
			{
				System.out.println("Missing Number from 1 to 10:"+(temp1+1));
			}
		}
	}

}
