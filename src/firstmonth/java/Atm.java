package firstmonth.java;
import java.util.Scanner;
public class Atm 
{
   public static void main(String[] args)
   {
	 double balance= 12435.93d;
	 System.out.println("Insert your card:"+"\n"+"welcome");
	 for(int i=0;i<3;i++)
	 {
	   Scanner pn=new Scanner(System.in);
	   System.out.print("Enter your 4 digit pin:");
	   int pin=pn.nextInt();
       if(pin==9000)
       {
         System.out.println("1.Deposit"+"\n"+"2.Withdrawl"+"\n"+"3.Checkbalance");
           System.out.print("Select your option:");
           for(int m=0;m<=m;m++)
           {
    	   int n=pn.nextInt();
    	   if(n==1)
    	   {
    	     System.out.print("Deposit cash:");
    		 int dc=pn.nextInt(); 
    		 double currentBalance= balance+dc;
    		 System.out.println("successfully Deposited"+"\n"+"Now Your current balance is:"+currentBalance+"rs.");
    	   }
    	   else if(n==2)
    	   {
    			System.out.print("Enter withdrawl amount: " );
    			for(int j=0;j<=j;j++)
       		 {
    			int wc=pn.nextInt();
    			if(wc<=balance)
    			{
    				if(wc%100==0)
    				{
    					break;
    				}
    				else
    				{
    					System.out.println("Enter a valid amount:");
    				}
    				int fcount=0; 
    				while(wc>=500)
    				{
    				  wc=wc-500;
    				  fcount=fcount-1;
    				}
    				int tcount=0; 
    				while(wc>=200)
    				{
    				  wc=wc-200;
    				  tcount=tcount-1;
    				}
    				int hcount=0; 
    				while(wc>=100)
    				{
    				  wc=wc-500;
    				  hcount=hcount-1;
    				}	
    				double currentBalance= balance-wc;
    				System.out.println("Transaction successfull"+"\n"+"500's-"+fcount+"\n"+"200's-"+tcount+"\n"+"100's-"+"\n"+"Your current balance is:"+currentBalance+"rs."+"\n"+"      ***THANKING YOU***     ");
    				break;
    			}
    			else
    			{
    				System.out.print("Insufficient Balance in your account."+"\n"+"please Re-enter your amount:");
    				    			
    			}
    		  }
    			
    	    }
	       else if(n==3)
	       {
	    	   System.out.println("Current balance:"+balance+"rs.");
	    	   break;
	       }
	       else
    	   {
    		   System.out.print("Invalid option."+"\n"+"please select a valid option:");
    	   }break;
        }
        break;	
      }
      else
      {
          System.out.println("Invalid pin.try again");
        	
      }
        
	}
    	 System.out.println("your card is blocked for 24 hrs."+"\n"+"because of 3 unsuccessfull attempts.");
  }
}
