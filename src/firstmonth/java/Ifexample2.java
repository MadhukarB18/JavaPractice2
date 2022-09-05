package firstmonth.java;
import java.util.Scanner;
import java.util.*;

public class Ifexample2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter your name: ");  
		String str= sc.nextLine();                
		Scanner m =new Scanner(System.in);
		System.out.print("enter your telugu marks:");
		int telugu=m.nextInt();
		System.out.print("enter your hindi marks:");
		int hindi=m.nextInt();
		System.out.print("enter your english marks:");
		int english=m.nextInt();
		System.out.print("enter your maths marks:");
		int maths=m.nextInt();
		
		int total = telugu + hindi + english + maths;
		int percentage = total/4;
		System.out.println("Name:"+str);

		if(telugu<35||hindi<35||english<35||maths<35)
		{
			System.out.println("Result:fail");
			
		}
		else
		{
			System.out.println("result:pass"+"\n"+"percentage:"+percentage);	
		}
	
		
	}

}
