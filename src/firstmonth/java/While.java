package firstmonth.java;
import java.util.Scanner;

public class While {

	public static void main(String[] args)
	{
		Scanner  m =new Scanner(System.in);
		System.out.println("enter n value:");
		int n= m.nextInt();
	   int i;
	  for(i=0;i<n;i++)
	  {
         System.out.println(i);
         i=i+1;
	  }
	}
}


