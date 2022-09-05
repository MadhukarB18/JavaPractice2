package firstmonth.java;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();			
		if(a>b&&a>c)
		{
			System.out.println("a is the largest number:");
		}
		else if(b>c&&b>a)
		{
			System.out.println("b is the largest number:");
		}
		else
		{
			System.out.println("c is the largest nummber:");
		}
		
	}

}
