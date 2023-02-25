package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String []args){
        String s="PayPal India";
        char c[]=s.toCharArray();
        Set<Character> charset=new LinkedHashSet<Character>();
        Set<Character> dupset=new LinkedHashSet<Character>();
        //Set<Character> charsetnew=new LinkedHashSet<Character>();
       /* System.out.println("Char Array");
        for(int i=0;i<c.length;i++)
        {
             System.out.println(c[i]);
        }*/
        for(int j=0;j<c.length;j++)
        {
            if(charset.contains(c[j]))
            {
                dupset.add(c[j]);
            }
            else
            {
                charset.add(c[j]);
            }
        }
         
         System.out.println("Set Elements"+charset);
         System.out.println("Duplicate Set Elements"+dupset);
         for(int k=0;k<c.length;k++)
         {
             if(dupset.contains(c[k]))
             {
                charset.remove(c[k]);
             }
         }
         System.out.println("Set elements after removing duplicate set elements"+charset);
         /*for(int l=0;l<charset.size();l++)
         {
             //System.out.println("Check");
             boolean con=charset.contains(null);
             System.out.println(con);
             if(charset.contains(" "))
             {
                charset.remove(null);
                System.out.println("Check");
             }
         }*/
       // System.out.println("Set elements after removing spaces"+charset); 
     }


}
