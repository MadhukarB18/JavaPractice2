package firstmonth.java;
import java.util.Scanner;

public class ElseIf {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any three numbers:");
		int m=sc.nextInt(); 
		int s=sc.nextInt();
		int r=sc.nextInt();
		if(m>s&&m>r)
		{
			System.out.println(" m is big");
		}
		else if(s>m&&s>r)
		{
			System.out.println("s is big");
		}
		else
		{
		    System.out.println("r is big");	
		}
		}
	}
	


