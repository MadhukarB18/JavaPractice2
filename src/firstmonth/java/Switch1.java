package firstmonth.java;

import java.util.Scanner;

public class Switch1 
{
	public static void main(String[] args)
	{
	  for(int i=0;i<10;i++)
	  {
		 Scanner ms=new Scanner(System.in);
		 System.out.print("enter input value:");
		 String m=ms.nextLine();
		
         switch(m)
         {
           case "one":
    	              System.out.println(1);
                      break;
		   case "two":
				      System.out.println(2);
                      break;
           case "three":
    	              System.out.println(3);
		        break;
		   case "four":
		    	      System.out.println(4);
		              break;
		   case "five":
		    	      System.out.println(5);
		              break;
		   default:
		    	      System.out.println("this number is not in 1 to 5 range.");
		        	
         }
		}
  }
	

}
