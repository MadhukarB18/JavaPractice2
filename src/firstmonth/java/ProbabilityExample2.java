package firstmonth.java;

import java.util.Random;
import java.util.Scanner;


public class ProbabilityExample2 {

	public static void main(String[] args) 
	{
		Random random=new Random();
		for(;;)
		{

			int input= random.nextInt(10);
		
			System.out.println("Random no.:"+ input);

			if((input>=0)&&(input<=4))
			{
				System.out.println("Green");
			}
			else if((input>=5)&&(input<=7))
			{
				System.out.println("Red");
			}
			else if((input>=8)&&(input<=9))
			{
				System.out.println("Blue");
			}
			System.out.println("please press Enter for throw dice");
			Scanner sc=new Scanner(System.in);
			sc.nextLine();
		}

		}

	}
