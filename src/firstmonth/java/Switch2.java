package firstmonth.java;
import java.util.Scanner;

public class Switch2 {
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    System.out.print("enter intput value:");
    int m=scan.nextInt();
    switch(m)
    {
      case 1:
               System.out.println("monday");
               break;
      case 2:
               System.out.println("tuesday");
               break;
      case 3:
               System.out.println("wenesday");
               break;
      case 4:
               System.out.println("thursday");
               break;
      case 5:
               System.out.println("friday");
               break;
      case 6:
               System.out.println("saturday");
               break;
      case 7:
               System.out.println("sunday");
               break;
      default:
               System.out.println("input is wrong");
    }
  }
 }             

