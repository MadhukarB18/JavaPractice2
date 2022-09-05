package firstmonth.java;

import java.util.ArrayList;

public class Array3 {
	  int max=0;
	public static void main(String[] args) {
		int max=0;
	  int[] madhu= {1,3,15,7,9,10,11,13,17,19,97,57,97};
	   ArrayList<Integer> prime=new ArrayList<Integer>();
	   for( int i=0;i<madhu.length;i++)
	  {
		   max=madhu[i];
	       int count=0;
	       
		   for(int j=1;j<=madhu[i];j++)
	      {
		  if(max%j==0)
		  {
			count+=1;
		  }
	      }
		   
		  if(count==2)
		{
			 
                prime.add(max);
		}
			
		
		  
	  }
	   
	   System.out.print(prime);
	   
}
}

