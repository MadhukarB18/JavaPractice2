package firstmonth.java;

public class Nested {
	public static void main(String[] args) 
	{
		int j;
		int count=0;
		int totalCount=0;
		for(int i=1;i<11;i++)
		{
			count = count+1;
			
           for(j=1;j<=10;j++)
           {
        	   totalCount = totalCount+1;
        	   System.out.println(i+"*"+j+"="+i*j);
        	 
        	 
           }
           int total=count+totalCount;
           System.out.println(total);
		
	}
		

}
}
