package firstmonth.java;
import java.util.Scanner;
public class Withdraw {

	public static void main(String[] args)
	
	{
	int amount=0;
	
    Scanner sc=new Scanner(System.in);
	System.out.print("Enter with draw amount:");
	while(true)
	{
	int wc=sc.nextInt();
	amount=wc;
	if(wc%100==0)
	{
		break;
	}
	else
	{
		System.out.println("Enter valid amount:");
	}
	}
	
	int fcount=0;
	while(amount>=500)
	{
	 amount= amount-500;
	fcount +=1;
	}
	int tcount=0;
	while(amount>=200)
	{
		amount=amount-200;
		tcount +=1;
	}
	int hcount=0;
	while(amount>=100)
	{
		amount=amount-100;
		hcount +=1;
	}
	System.out.println("500's-"+fcount);
	System.out.println("200's-"+tcount);
	System.out.println("100's-"+hcount);
	
	
	
	
	
	
	
	}
	
	}



