package firstmonth.java;

import java.util.ArrayList;

public class ArrayDuplicate {
	
public static void main(String[] args) {

	int max =0;
	int min=0;
	int count=0;
	int rcount=0;
	int[] madhu= {1,2,3,3,4,15,15,3,2,7};
	 ArrayList<Integer> array=new ArrayList<Integer>();
	for(int i=0;i<madhu.length;i++)
	{
		
		for(int j=0;j<madhu.length;j++)
		{
	     if(madhu[i] == madhu[j])
	     {
	    	 count=count+1;
	     }
	     
		}
		if(count>=2)
		{
		   array.add(madhu[i]);	 
	//		System.out.println(madhu[i]);	  
			
		}
		
		count=0;
		
	}

	System.out.println(array);
	for(int k=0;k<array.length;k++);
	{
		for(int l=0;l<array.length;l++)
			
	}
		

	
}
}


