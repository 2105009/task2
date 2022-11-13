//magdalene kitolo
/* the user inputs three number and the program determines the small and greater number*/
package Kitolo;
import java.util.Scanner;   // we call it Java. util because it utilises the class
public class smallest$greatestnumber {
	

	 //our class name
		public static void main(String[]args)
		{
			Scanner input=new Scanner(System.in); // allows inputing of values
			int num1, num2, num3;
			System.out.print("input  your first number here");//instruct the user to enter the data
			
			num1= input.nextInt(); // allows the inputing of data into  the system
	System.out.print("input  your second number here");
			
	num2= input.nextInt();
	System.out.print("input  your third number here");
			
	num3= input.nextInt();
			if ((num1>num2)==true) // here we will use the repetition function
			{
				if(num1>num2) {
					System.out.print( "the largest number is:"+num1);
					
				}
				else
				{
					System.out.print("the smallest number is:"+num2);//output once the boolean turns false
				}
			}
			if ((num1>num2)==false)
			{
				if(num2>num3)
				{
					System.out.print( "the largest number is :"+num2);
				}
				else
				{ 
					System.out.print("the smallest number is :"+num3); // outputs this nce the boolean turns true
				}
			}
			System.out.print("\n");
			//this is to display the smallest
			
			
			if ((num1<num2)==false) // here we will use the repetition function
			{
				if(num1<num3) {
					System.out.print( "the largest number is:"+num1);
					
				}
				else
				{
					System.out.print("the smallest number is:"+num3);//output once the boolean turns false
				}
			}
			if ((num1<num2)==true)
			{
				if(num2<num3)
				{
					System.out.print( "the largest number is :"+num2);
				}
				else
				{ 
					System.out.print("the smallest number is :"+num3); // outputs this nce the boolean turns true
				}
			}
		}
				


}
