package firstmonth.java;

// int a=[4,1,3] largest  print all array no.s
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
//		int i;
//		int a[]= {4,1,3};
//		for(i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		

  int n;  
  Scanner sc=new Scanner(System.in);  
  System.out.print("Enter the number of elements: ");  
  n=sc.nextInt();  
  int[] array = new int[3];  
  System.out.println("Enter the elements of the array: ");  
  for(int i=0;i<n;i++)  
  {  
    array[i]=sc.nextInt();  
  }  
  System.out.println("Array elements are: ");  
  for (int i=0;i<n;i++)   
  {  
    System.out.println(array[i]);  
  }  
}   

}

